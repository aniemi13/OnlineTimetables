package onlineTimetables.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import onlineTimetables.entity.users.form.LoginForm;
import onlineTimetables.logic.DispatcherApplicationLogic;
import onlineTimetables.logic.validation.LoginValidation;

@Controller
public class LoginController {
	private DispatcherApplicationLogic logic;
	private LoginValidation loginValidation;

	@Autowired
	public LoginController(DispatcherApplicationLogic logic) {
		this.logic = logic;
		this.loginValidation = new LoginValidation();
	}
	
	@PostMapping(value = "/zaloguj")
	public ModelAndView login(@Valid LoginForm loginForm, BindingResult bindingResult, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		model.addAttribute("bez_hasla", "brak hasła");
		loginValidation.validate(loginForm, bindingResult);
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("home");
			return modelAndView;
		}
		if (!logic.login(loginForm)) {
			writeLoginError(bindingResult);
			modelAndView.setViewName("home");
			return modelAndView;
		}
		modelAndView.setViewName("redirect:/home");
		return modelAndView;
	}
 	

	private void writeLoginError(BindingResult bindingResult) {
		bindingResult.rejectValue("email", "Błędny email lub hasło", "Błędny email lub hasło");
	}
	
	// wyloguj
		@RequestMapping("/wyloguj")
		@ResponseBody
		public String logOut() {
			return logic.logOut();
		}
}
