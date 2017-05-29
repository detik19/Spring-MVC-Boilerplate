package com.embeddednesia.springmvc.web.controllers;


import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.embeddednesia.springmvc.web.domain.User;



@Controller
@RequestMapping("/users")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(path="list.html",method = RequestMethod.GET)
	public String listAll(Locale locale, Model model) {

		// model.addAttribute("users", userService.findAllUsers());
		return "user/list";
	}
	
	@RequestMapping(path = "/new.html", method = RequestMethod.GET)
	public String newUserForm(Model model) {

		User user = new User();
		model.addAttribute("user", user);
		return "new";
	}
	
	@RequestMapping(path = "/new.html", method = RequestMethod.POST)
	public String saveNewUser(@ModelAttribute("user") User user, Model model) {

		logger.debug("save new user");
		return "redirect:/users/new.html";
	}

}
