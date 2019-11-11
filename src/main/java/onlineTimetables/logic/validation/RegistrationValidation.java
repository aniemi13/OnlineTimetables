package onlineTimetables.logic.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import onlineTimetables.data.UsersRepository;
import onlineTimetables.entity.users.form.RegistrationForm;

@Component
public class RegistrationValidation implements Validator {
	private UsersRepository usersRepository;

	@Autowired
	public RegistrationValidation(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return RegistrationForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RegistrationForm registrationForm = (RegistrationForm) target;
		checkTheCorrectnessOfPasswords(registrationForm, errors);
		checkIfTheEmailExist(registrationForm, errors);
	}

	private void checkTheCorrectnessOfPasswords(RegistrationForm registrationForm, Errors errors) {
		if (checkThatThepasswordsAreTheSame(registrationForm)) {
			errors.rejectValue("password", "Hasła muszą być indentyczne", "Hasła muszą być identyczne");
		}
	}

	private boolean checkThatThepasswordsAreTheSame(RegistrationForm registrationForm) {
		return !registrationForm.getPassword().equals(registrationForm.getConfirmPassword());
	}

	private void checkIfTheEmailExist(RegistrationForm registrationForm, Errors errors) {
		if (userExist(registrationForm.getEmail())) {
			errors.rejectValue("email", "Podany email znajduje się w bazie", "Podany email znajduje się w bazie");
		}
	}
	
	private boolean userExist(String email) {
		return usersRepository.findUser(email) != null;
	}
	
}
