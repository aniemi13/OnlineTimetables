package onlineTimetables.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import onlineTimetables.data.UsersRepository;
import onlineTimetables.entity.users.form.LoginForm;
import onlineTimetables.entity.users.form.RegistrationForm;

@Component
public class DispatcherApplicationLogic {
	private EmployeeLogic employeeLogic;
	private RegistrationLogic registrationLogic;	
	private LoginLogic loginLogic;
	private SearchLogic searchLogic;
	private UserLogic userLogic;

	@Autowired
	public DispatcherApplicationLogic(EmployeeLogic employeeLogic, RegistrationLogic registrationLogic,
			LoginLogic loginLogic, SearchLogic searchLogic, UserLogic userLogic) {
		this.employeeLogic = employeeLogic;
		this.registrationLogic = registrationLogic;
		this.loginLogic = loginLogic;
		this.searchLogic = searchLogic;
		this.userLogic = userLogic;
	}

	public boolean login(LoginForm loginForm) {
		return loginLogic.login(loginForm);
	}
	// logika logownia
	// logika wyszukiwania
	// logika pracownika
	// logika użytkownika
	// logika sesji?

	public boolean registration(RegistrationForm registrationForm) {
		return registrationLogic.registration(registrationForm);
		
	}

	public String logOut() {
		return loginLogic.logOut();
	}

	public String goToUserProfile() {
		return loginLogic.goToUserProfile();
	}
}
