package onlineTimetables.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import onlineTimetables.entity.users.form.RegistrationForm;
import onlineTimetables.logic.DispatcherApplicationLogic;
import onlineTimetables.logic.validation.RegistrationValidation;

@Controller
public class RegistrationController {
	private DispatcherApplicationLogic logic;
	private RegistrationValidation validation;

	@Autowired
	public RegistrationController(DispatcherApplicationLogic logic) {
		this.logic = logic;
	}

	// TO DO FORMULARZA REJESTRACJI
	@PostMapping("/zarejestruj")
	public String registration(@Valid RegistrationForm registrationForm, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		validation.validate(registrationForm, bindingResult);
		if (bindingResult.hasErrors()) {
			return "/registration";
		}
		return logic.registration(registrationForm);
	}

	// przejdz do strony rejestracji
	@GetMapping("/rejestracja")
	public String goToRegistrationForm(Model model) {
		model.addAttribute("registrationForm", new RegistrationForm());
		return "/registration";
	}
}
