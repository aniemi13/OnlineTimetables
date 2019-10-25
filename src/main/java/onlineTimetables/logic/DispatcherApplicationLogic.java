package onlineTimetables.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import onlineTimetables.data.UsersRepository;
import onlineTimetables.entity.users.form.LoginForm;
import onlineTimetables.entity.users.form.RegistrationForm;

@Component
public class DispatcherApplicationLogic {
	@Autowired
	private RegistrationLogic registrationLogic;
	@Autowired
	private LoginLogic loginLogic;

	public String login(LoginForm loginForm) {
		return loginLogic.login(loginForm);
	}
	// logika logownia
	// logika wyszukiwania
	// logika pracownika
	// logika użytkownika
	// logika sesji?

	public String registration(RegistrationForm registrationForm) {
		return registrationLogic.registration(registrationForm);
		
	}

	public String logOut() {
		return loginLogic.logOut();
	}

	public String goToUserProfile() {
		return loginLogic.goToUserProfile();
	}
}
