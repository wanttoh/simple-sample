package com.example.demo1.dao;

import java.util.List;

import com.example.demo1.model.User;

public interface IndexDao {
	
	List<User> getAll();
	
	User getOne(Long id);
	
}
