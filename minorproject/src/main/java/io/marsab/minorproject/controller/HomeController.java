package io.marsab.minorproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.marsab.minorproject.model.User;
import io.marsab.minorproject.service.UserServiceImpl;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	/*
	 * view display mappings 
	 */
	@RequestMapping("/showindex")
	public ModelAndView showIndex() {
		ModelAndView modelAndView=new ModelAndView("index");
		return modelAndView;
	}
	@RequestMapping("/showlogin")
	public ModelAndView showLogin() {
		ModelAndView modelAndView=new ModelAndView("login");
		return modelAndView;
	}
	@RequestMapping("/showsignup")
	public ModelAndView showSignUp() {
		ModelAndView modelAndView=new ModelAndView("signup");
		return modelAndView;
	}
	/*
	 * data operation mappings
	 */
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("usermail") String email, @RequestParam("userpwd") String pwd) {
		   ModelAndView modelAndView;
		   User user=new User();
		   user.setEmail(email);
		   user.setPassword(pwd);
		   User user_temp=userServiceImpl.getUser(user);
		   if(user_temp==null) {
			   modelAndView=new ModelAndView("login");
		   }else {
			   modelAndView=new ModelAndView("index");
		   }
		   return modelAndView;
	}
	
	
}
