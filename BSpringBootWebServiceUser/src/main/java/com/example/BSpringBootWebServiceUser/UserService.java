package com.example.BSpringBootWebServiceUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService
{

	@Override
	public List<User> findAll() {
		
		ArrayList<User>u1=new ArrayList<>();
		u1.add(new User(2001,"azar","azar@gmail.com"));
		u1.add(new User(2001,"mohamed","mohamed@gmail.com"));
		return u1;
		
	}
  
}
