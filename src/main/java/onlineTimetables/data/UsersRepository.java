package onlineTimetables.data;

import org.springframework.stereotype.Component;

import onlineTimetables.entity.users.User;
import onlineTimetables.entity.users.form.LoginForm;
import onlineTimetables.entity.users.form.RegistrationForm;

@Component
public class UsersRepository {

	public User findUser(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean findUser(RegistrationForm registrationForm) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addUser(RegistrationForm registrationForm) {
		// TODO Auto-generated method stub
		return true;
	}

}
