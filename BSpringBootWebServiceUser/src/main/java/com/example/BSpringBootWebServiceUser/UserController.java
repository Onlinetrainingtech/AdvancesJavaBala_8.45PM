package com.example.BSpringBootWebServiceUser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private IUserService userService;
	
	@GetMapping(value="/user")
	public List<User>getUserDetails()
	{
		List<User>p1=userService.findAll();
		return p1;
	}
}
