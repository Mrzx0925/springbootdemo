package com.springboot.mydemo.repository;

import com.springboot.mydemo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository
public interface UserRespository extends JpaRepository<User,Integer>  {
}
