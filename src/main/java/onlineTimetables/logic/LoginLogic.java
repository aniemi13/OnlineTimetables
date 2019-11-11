package onlineTimetables.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import onlineTimetables.data.UsersRepository;
import onlineTimetables.entity.users.User;
import onlineTimetables.entity.users.form.LoginForm;

@Component
public class LoginLogic {
	@Autowired
	private UsersRepository usersRepository;

	public boolean login(LoginForm loginForm) {
		String email = loginForm.getEmail();
		User user;
		user = usersRepository.findUser(email);
		if (userExist(user)) {
			//PLUS DODANIE DO SESJI DANYCH ZALOGOWANEGO UŻYTKOWNIKA
			return true;
		}
		return false;
	}

	private boolean userExist(User user) {
		return user != null;
	}

	public String logOut() {
		// TODO Auto-generated method stub
		return "wylogowano";
	}

	public String goToUserProfile() {
		// TODO Auto-generated method stub
		// get data about user from session
		return "profil użytkownika";
	}

}
