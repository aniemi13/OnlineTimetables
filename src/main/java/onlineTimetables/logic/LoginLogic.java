package onlineTimetables.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import onlineTimetables.data.UsersRepository;
import onlineTimetables.entity.users.form.LoginForm;

@Component
public class LoginLogic {
	@Autowired
	private UsersRepository usersRepository;

	public String login(LoginForm loginForm) {
		if (usersRepository.findUser(loginForm)) {
			//PLUS DODANIE DO SESJI DANYCH ZALOGOWANEGO UŻYTKOWNIKA
			return "zalogowano";
		}
		return "nie zalogowano";
	}

}
