package onlineTimetables.controllers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import onlineTimetables.entity.users.form.LoginForm;
import onlineTimetables.logic.DispatcherApplicationLogic;

//@RunWith(SpringRunner.class)
//@WebMvcTest
public class HomeControllerTest {

	@Test
	public void testLogin() throws Exception {
		DispatcherApplicationLogic logic = mock(DispatcherApplicationLogic.class);
		LoginForm loginForm = new LoginForm();
		loginForm.setEmail("niemczyk13@o2.pl");
		loginForm.setPassword("asdasdasd");
		when(logic.login(loginForm)).thenReturn("nie_zalogowano");
		
		HomeController controller = new HomeController(logic);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		
		mockMvc.perform(post("/zaloguj")
			.param("email", "niemczyk13@o2.pl")
			.param("password", "asdasdasd"))
			.andExpect(content().string(containsString("nie_zalogowano")));
		
		
	}

//	@Test
//	public void testGoToRegistrationForm() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSearchStop() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testLogOut() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGoToUserProfile() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testHome() {
//		fail("Not yet implemented");
//	}

}
