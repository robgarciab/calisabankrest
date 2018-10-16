package com.ca.lisabank.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ca.lisabank.service.LisaBankService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LisaBankControllerTests {

	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private LisaBankService lisaBankService;

    @Test
    public void listUsersShouldReturnOK() throws Exception {
    	Mockito.when(lisaBankService.listUsers()).thenReturn(new ArrayList<>());
        this.mockMvc.perform(get("/users")).andDo(print()).andExpect(status().isOk())
                .andExpect(status().isOk());
    }
}
