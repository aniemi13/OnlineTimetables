package onlineTimetables.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import onlineTimetables.data.EmployeesRepository;

@Controller
public class HomeController {
	@Autowired
	
	
	//zaloguj
	
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
