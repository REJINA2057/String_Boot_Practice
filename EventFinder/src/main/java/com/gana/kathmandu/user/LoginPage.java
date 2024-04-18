package com.gana.kathmandu.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginPage {
	
	@Autowired
	private UserServices userServices;

	@RequestMapping(method=RequestMethod.POST, value="/login")
	public void addUser(@RequestBody Users user) {
		userServices.addUser(user);
	}
	
	@RequestMapping("/login")
	public List <Users>getUser() {
		return userServices.getUser();
	}
	
}
