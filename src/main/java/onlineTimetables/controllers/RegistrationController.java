package onlineTimetables.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import onlineTimetables.entity.users.form.RegistrationForm;
import onlineTimetables.logic.RegistrationLogic;
import onlineTimetables.logic.validation.RegistrationValidation;

@Controller
public class RegistrationController {
	private RegistrationLogic logic;
	private RegistrationValidation validation;

	@Autowired
	public RegistrationController(RegistrationLogic logic, RegistrationValidation validation) {
		this.logic = logic;
		this.validation = validation;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(validation);
	}

	@PostMapping("/zarejestruj")
	public ModelAndView registration(@Valid RegistrationForm registrationForm, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			return returnValidationErrorsAndGoToRegistrationView(modelAndView);
		}
		if (!logic.registration(registrationForm)) {
			return returnRegistrationErrorAndGoToRegistrationView(modelAndView);
		}
		return redirectToHomeView(modelAndView);
	}

	private ModelAndView redirectToHomeView(ModelAndView modelAndView) {
		modelAndView.setViewName("redirect:/home");
		return modelAndView;
	}

	private ModelAndView returnRegistrationErrorAndGoToRegistrationView(ModelAndView modelAndView) {
		modelAndView.addObject("registration_error", "Błąd rejestracji");
		modelAndView.setViewName("/registration");
		return modelAndView;
	}

	private ModelAndView returnValidationErrorsAndGoToRegistrationView(ModelAndView modelAndView) {
		modelAndView.setViewName("/registration");
		return modelAndView;
	}

	@GetMapping("/rejestracja")
	public ModelAndView goToRegistrationForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("registrationForm", new RegistrationForm());
		modelAndView.setViewName("/registration");
		return modelAndView;
	}
}
