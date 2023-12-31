package com.justreadit.blog.service;

import java.util.List;

import com.justreadit.blog.payload.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);  
	UserDto registerAdmin(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto getUserById(Integer userId); 
	List<UserDto> getAllUsers();  
	void deleteUser(Integer userId);
	
}
