package com.embeddednesia.web.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController {
	
	
	@RequestMapping(path="index.html",method = RequestMethod.GET)
	public String listAll(Locale locale, Model model) {

		// model.addAttribute("users", userService.findAllUsers());
		return "user/list";
	}
}
