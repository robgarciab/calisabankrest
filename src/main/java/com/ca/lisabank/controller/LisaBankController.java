package com.ca.lisabank.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ca.lisabank.service.LisaBankService;
import com.itko.examples.ejb3.User;

@RestController
public class LisaBankController {

	private LisaBankService lisaBankService;
	
	public LisaBankController(LisaBankService lisaBankService) {
		this.lisaBankService = lisaBankService;
	}
	
	@RequestMapping("/users")
    public List<User> getUsers() {
        return lisaBankService.listUsers();
    }
	
	@RequestMapping("/{user}")
    public User message(@PathVariable String user) {
        return lisaBankService.getUser(user);
    }
}
