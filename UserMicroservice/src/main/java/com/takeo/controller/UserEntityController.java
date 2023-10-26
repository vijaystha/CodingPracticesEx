package com.takeo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.entity.UserEntity;
import com.takeo.service.impl.UserServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/home/user")
public class UserEntityController {
	private final UserServiceImpl userService;

	@PostMapping("/create")
	public String createUser(@RequestBody UserEntity userEntity) {
		UserEntity createdUser = userService.createUser(userEntity);
		if (createdUser != null) {
			return "User created Successfully";
		}
		return "User can not be created at this time";
	}
}
