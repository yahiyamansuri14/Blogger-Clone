package io.marsab.minorproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.marsab.minorproject.model.User;
import io.marsab.minorproject.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/signup")
	public ModelAndView signup(@RequestParam("username") String username,@RequestParam("usermail") String usermail,@RequestParam("userpwd") String userpwd) {
		   ModelAndView modelAndView=new ModelAndView("index");
		   User user=new User();
		   user.setEmail(usermail);
		   user.setPassword(userpwd);
		   user.setUsername(username);
		   userServiceImpl.saveUser(user);
		   return modelAndView;
		
	}
}
