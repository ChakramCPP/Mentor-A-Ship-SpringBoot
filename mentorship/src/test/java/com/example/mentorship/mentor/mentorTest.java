package com.example.mentorship.mentor;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.associate.Associate;
import com.example.associate.AssociateController;
import com.example.mentor.Mentor;
import com.example.mentor.MentorController;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class mentorTest {
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	ObjectMapper om = new ObjectMapper();
	
	@InjectMocks
	private MentorController mentorController; 
	
	@BeforeEach
	public void setUp() throws Exception{
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		System.out.println(mockMvc);
	}

	@Test
	void test() throws Exception {
		//		fail("Not yet implemented");
		Mentor m = new Mentor();
		m.setMname("test name");
		m.setEmail("testemail");
		m.setPwd("tet pwd");
		String j=om.writeValueAsString(m);
			
		//MvcResult result=
				mockMvc.perform(
				get("/mentor/all")
				.content(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(jsonPath("$",Matchers.hasSize(7)))
				.andExpect(jsonPath("$[4].mname",Matchers.is("mentor1")));
//				.andExpect(jsonPath("$",Matchers.hasSize(17)));
//		.andExpect(jsonPath("$[0].aname",Matchers.is("chakri"))
//		.andExpect(status().isOk())
	}

}
