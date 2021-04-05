package com.example.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import tacos.TacoCloudApplication;
import tacos.web.HomeController;

@WebMvcTest(HomeController.class)
@ContextConfiguration(classes = TacoCloudApplication.class)
class TacoCloudApplicationTests {

	@Autowired
	private MockMvc mockmvc;

	@Test
	public void testHomePage() throws Exception {
		mockmvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"))
				.andExpect(content().string(containsString("Hello")));
	}

	@Test
	void contextLoads() {
	}

}
