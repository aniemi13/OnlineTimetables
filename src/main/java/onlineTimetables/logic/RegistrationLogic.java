package onlineTimetables.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import onlineTimetables.data.UsersRepository;
import onlineTimetables.entity.users.form.RegistrationForm;

@Component
public class RegistrationLogic {
	private UsersRepository usersRepository;

	@Autowired
	public RegistrationLogic(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	public boolean registration(RegistrationForm registrationForm) {
		String email = registrationForm.getEmail();
		String password = registrationForm.getPassword();
		String confirmPassword = registrationForm.getConfirmPassword();
		return usersRepository.addUser(email, password, confirmPassword);
	}
}
