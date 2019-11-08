package onlineTimetables.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import onlineTimetables.entity.users.form.LoginForm;
import onlineTimetables.logic.DispatcherApplicationLogic;

@Controller
public class HomeController {
	private DispatcherApplicationLogic logic;

	@Autowired
	public HomeController(DispatcherApplicationLogic logic) {
		this.logic = logic;
	}

	@RequestMapping(value = "/wyszukaj_przystanek", method = RequestMethod.GET)
	public String searchStop() {
		return null;
	}

//	@RequestMapping(value = "/wyszukaj_trase", method = RequestMethod.GET)
//	public String searchRoute() {
//		return null;
//	}

	

	// przejdz na profil użytkownika
	@RequestMapping("/uzytkownik")
	@ResponseBody
	public String goToUserProfile() {
		return logic.goToUserProfile();
	}

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("loginForm", new LoginForm());
		return "home";
	}
}
