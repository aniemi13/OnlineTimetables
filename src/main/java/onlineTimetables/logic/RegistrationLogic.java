package onlineTimetables.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import onlineTimetables.data.UsersRepository;
import onlineTimetables.entity.users.form.RegistrationForm;

@Component
public class RegistrationLogic {
	@Autowired
	private UsersRepository usersRepository;

	public String registration(RegistrationForm registrationForm) {
		if (!usersRepository.findUser(registrationForm)) {
			return "podany email istnieje w bazie";
		}
		
		if (!checkIdThePasswordsAreTheSame(registrationForm)) {
			return "hasła nie są identyczne";
		}
		
		if (usersRepository.addUser(registrationForm)) {
			return "zarejestrowano";
		}
		
		return "nie zarejestrowano - błąd rejestracji";
	}
	
	private boolean checkIdThePasswordsAreTheSame(RegistrationForm registrationForm) {
		return registrationForm.getPassword().equals(registrationForm.getConfirmPassword());
	}

}
