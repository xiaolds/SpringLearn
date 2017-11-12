package com.lids.spring.web;


import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * UnitTest For HomeController
 * @author xiaol
 *
 */
public class HomeControllerTest {

	@Test
	public void TestHomePage() throws Exception {
		HomeController hc = new HomeController();
		MockMvc mockMvc = standaloneSetup(hc).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}
	
	
}
