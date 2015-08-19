package com.jipasoft.form.service;

import java.util.List;

import com.jipasoft.form.model.User;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
	
}