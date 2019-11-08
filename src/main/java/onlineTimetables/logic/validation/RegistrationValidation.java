package onlineTimetables.logic.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;

import onlineTimetables.entity.users.form.RegistrationForm;
import onlineTimetables.logic.DispatcherApplicationLogic;

public class RegistrationValidation {
	private DispatcherApplicationLogic logic;
	
	@Autowired
	public RegistrationValidation(DispatcherApplicationLogic logic) {
		this.logic = logic;
	}


	public void validate(RegistrationForm registrationForm, BindingResult bindingResult) {
		//sprawdzenie czy hasła są identyczne
		//sprawdzenie czy podany email istnieje w bazie
	}
	
}
