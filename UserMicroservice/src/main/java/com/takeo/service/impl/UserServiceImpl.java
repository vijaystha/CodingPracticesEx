package com.takeo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takeo.entity.UserEntity;
import com.takeo.repo.UserEntityRepo;
import com.takeo.service.UserService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserEntityRepo userEntityRepo;

	@Override
	public UserEntity createUser(UserEntity userEntity) {
//		private final UserEntityRepo userEntityRepo;
		return userEntityRepo.save(userEntity);
	}

}
