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
import onlineTimetables.logic.ApplicationLogic;

@Controller
public class HomeController {
	@Autowired
	private ApplicationLogic logic;
	
	//zaloguj
	@RequestMapping(value = "/zaloguj", method = RequestMethod.POST)
	public String login(@Valid LoginForm loginForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "/";
		}
		return logic.login(loginForm);
	}
	
	@RequestMapping("/zarejestruj")
	public String registration() {
		return "/zarejestruj";
	}
	
	//przejdz do strony rejestracji
	
	//wyszukaj
	
	//wyloguj
	
	//przejdz na profil użytkownika
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Witaj świecie!";
	}
}
