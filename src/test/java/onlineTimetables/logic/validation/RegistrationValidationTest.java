package onlineTimetables.logic.validation;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.BindingResult;

import onlineTimetables.data.UsersRepository;
import onlineTimetables.entity.users.form.RegistrationForm;

@RunWith(SpringJUnit4ClassRunner.class)
public class RegistrationValidationTest {
	private BindingResult bindingResult;
	private RegistrationForm registrationForm;
	private RegistrationValidation registrationValidation;
	private UsersRepository usersRepository;
	
	@Before
	public void setup() {
		bindingResult = mock(BindingResult.class);
		usersRepository = mock(UsersRepository.class);
		
		registrationForm = new RegistrationForm();
		registrationForm.setEmail("niemczyk13@o2.pl");
		registrationForm.setPassword("zaq12wsx");
		registrationForm.setConfirmPassword("zaq12wsx");
	}

	@Test
	public void testValidate() {
		when(usersRepository.findUser(registrationForm)).thenReturn(true);
//		registrationValidation.validate(registrationForm, bindingResult);
		
		
	}

}
