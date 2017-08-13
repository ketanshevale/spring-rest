package com.google.springrest.repository;

import java.util.List;
import java.util.Optional;

import com.google.springrest.entity.User;

public interface UserRepository {
	public List<User> findAll();
	public Optional<User> findOne(String userId);
	public Optional<User> findByEmail(String email);
	public User create(User user);
	public User update(User user);
	public void delete(User user);
}
