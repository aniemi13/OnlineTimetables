package onlineTimetables.controllers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import onlineTimetables.entity.users.form.LoginForm;
import onlineTimetables.logic.DispatcherApplicationLogic;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebMvcTest
public class HomeControllerTest {
	private DispatcherApplicationLogic logic;
	private LoginForm loginForm;
	private HomeController controller;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		logic = mock(DispatcherApplicationLogic.class);
		loginForm = new LoginForm();
		controller = new HomeController(logic);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	public void testLogin() throws Exception {
		when(logic.login(loginForm)).thenReturn("nie_zalogowano");
		
		mockMvc.perform(post("/zaloguj")
			.param("email", "niemczyk13@o2.pl")
			.param("password", "asdasdasd"))
			.andExpect(content().string(containsString("nie_zalogowano")));
	}

	@Test
	public void testGoToRegistrationForm() throws Exception {
		mockMvc.perform(get("/rejestracja")).andExpect(content().string(containsString("rejestracja")));
	}

	@Test
	public void testSearchStop() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogOut() throws Exception {
		when(logic.logOut()).thenReturn("wylogowano");
		
		mockMvc.perform(get("/wyloguj")).andExpect(content().string(containsString("wylogowano")));
	}

	@Test
	public void testGoToUserProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testHome() {
		fail("Not yet implemented");
	}

}
