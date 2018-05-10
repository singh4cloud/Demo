package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {
	private List<User> userlist = null;

	public UserService(List<User> userlist) {
		super();
		userlist = new ArrayList<User>();
		for (int i = 0; i < 5; i++) {
			User user1 = new User("ssn_MicroServiceUser3" + i, "fistrName_MicroServiceUser3" + i,
					"lastName_MicroServiceUser3" + i, "courseCode_MicroServiceUser3" + i);
			userlist.add(user1);
		}
		this.userlist = userlist;
	}

	public List<User> getUsers() {
		return userlist;
	}

}
