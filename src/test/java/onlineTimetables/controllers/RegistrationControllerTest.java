package onlineTimetables.controllers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import onlineTimetables.entity.users.form.RegistrationForm;
import onlineTimetables.logic.RegistrationLogic;
import onlineTimetables.logic.validation.RegistrationValidation;

@RunWith(SpringJUnit4ClassRunner.class)
public class RegistrationControllerTest {
	private RegistrationLogic registrationLogic;
	private RegistrationValidation validation;
	private BindingResult bindingResult;
	private RegistrationForm registrationForm;
	private MockMvc mockMvc;
	private RegistrationController controller;
	
	@Before
	public void setup() {
		registrationLogic = mock(RegistrationLogic.class);
		validation = mock(RegistrationValidation.class);
		bindingResult = mock(BindingResult.class);
		registrationForm = new RegistrationForm();
		registrationForm.setEmail("niemczyk13@o2.pl");
		registrationForm.setPassword("zaq12wsx");
		registrationForm.setConfirmPassword("zaq12wsx");
		
		controller = new RegistrationController(registrationLogic, validation);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void testRegistration() {
//		mockMvc.perform(post("/zarejestruj").param("email", "niemczyk13@o2.pl")
//			.param("password", "zaq12wsx")
//			.param("confirmPassword", "zaq12wsx"))
//			.andExpect();
	}

	@Test
	public void testGoToRegistrationForm() {
		fail("Not yet implemented");
	}

}
