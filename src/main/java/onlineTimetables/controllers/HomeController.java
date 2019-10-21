package onlineTimetables.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import onlineTimetables.data.EmployeesRepository;
import onlineTimetables.entity.users.form.LoginForm;
import onlineTimetables.entity.users.form.RegistrationForm;
import onlineTimetables.logic.DispatcherApplicationLogic;

@Controller
public class HomeController {
	@Autowired
	private DispatcherApplicationLogic logic;
	
	@RequestMapping(value = "/zaloguj", method = RequestMethod.POST)
	@ResponseBody
	public String login(@Valid LoginForm loginForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "/";
		}
		return logic.login(loginForm);
	}
	
	@RequestMapping(value = "/zarejestruj", method = RequestMethod.POST)
	@ResponseBody
	public String registration(@Valid RegistrationForm registrationForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "/";
		}
		return logic.registration(registrationForm);
	}
	
	
	//przejdz do strony rejestracji
	
	@RequestMapping(value = "/wyszukaj_przystanek", method = RequestMethod.GET)
	public String searchStop() {
		return null;
	}
	
	@RequestMapping(value = "/wyszukaj_trase", method = RequestMethod.GET)
	public String searchRoute() {
		return null;
	}
	
	//wyloguj
	
	//przejdz na profil użytkownika
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Witaj świecie!";
	}
}
