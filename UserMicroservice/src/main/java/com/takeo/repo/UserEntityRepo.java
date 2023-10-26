package com.takeo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.takeo.entity.UserEntity;

public interface UserEntityRepo extends JpaRepository<UserEntity, Integer> {

}
