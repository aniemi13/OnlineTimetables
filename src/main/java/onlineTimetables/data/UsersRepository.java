package onlineTimetables.data;

import org.springframework.stereotype.Component;

import onlineTimetables.entity.users.User;
import onlineTimetables.entity.users.form.LoginForm;
import onlineTimetables.entity.users.form.RegistrationForm;

@Component
public class UsersRepository {
	
	public User findUser(String email) {
		
		return null;
	}
	
	public boolean addUser(String email,
			String password, String confirmPassword) {
		
		return false;
	}
}
