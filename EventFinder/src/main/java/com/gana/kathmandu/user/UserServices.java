package com.gana.kathmandu.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServices {
	private List<Users> users= new ArrayList<>(Arrays.asList());
	
	public void addUser(Users user) {
		users.add(user);
	}

	public List<Users> getUser() {
		// TODO Auto-generated method stub
		return users;
	}
}
