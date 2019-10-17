package onlineTimetables.logic;

import org.springframework.beans.factory.annotation.Autowired;

import onlineTimetables.entity.users.form.LoginForm;

public class ApplicationLogic {
	@Autowired
	private LoginLogic loginLogic;

	public String login(LoginForm loginForm) {
		return loginLogic.login(loginForm);
	}
	//logika rejestracji
	//logika logownia
	//logika wyszukiwania
	//logika pracownika
	//logika użytkownika
	//logika sesji?
	
}
