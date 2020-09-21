package com.example.mentorship.associateTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.associate.Associate;
import com.example.associate.AssociateController;
import com.example.associate.AssociateRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class associateTest {
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	ObjectMapper om = new ObjectMapper();
	
	@InjectMocks
	private AssociateController associateController; 
	
	@BeforeEach
	public void setUp() throws Exception{
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		System.out.println(mockMvc);
	}

	@Test
	void test() throws Exception {
		//		fail("Not yet implemented");
		Associate a = new Associate();
		a.setAname("test name");
		a.setEmail("testemail");
		a.setPwd("tet pwd");
		String j=om.writeValueAsString(a);
			
		//MvcResult result=
				mockMvc.perform(
				get("/associate/all")
				.content(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(jsonPath("$",Matchers.hasSize(15)))
				.andExpect(jsonPath("$[9].aname",Matchers.is("ramachanged")));
//				.andExpect(jsonPath("$",Matchers.hasSize(17)));
//		.andExpect(jsonPath("$[0].aname",Matchers.is("chakri"))
//		.andExpect(status().isOk())
	}

}