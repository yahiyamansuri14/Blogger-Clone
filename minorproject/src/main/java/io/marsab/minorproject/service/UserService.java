package io.marsab.minorproject.service;

import org.springframework.stereotype.Service;

import io.marsab.minorproject.model.User;


public interface UserService {
	public void saveUser(User user);
	public User getUser(User user);
}
