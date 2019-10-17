package onlineTimetables.logic;

import org.springframework.beans.factory.annotation.Autowired;

import onlineTimetables.data.UsersRepository;
import onlineTimetables.entity.users.form.LoginForm;

public class LoginLogic {
	@Autowired
	private UsersRepository usersRepository;

	public String login(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

}
