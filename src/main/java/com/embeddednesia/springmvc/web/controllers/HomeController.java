package com.embeddednesia.springmvc.web.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/index")
public class HomeController {
	private static final Logger logger=LoggerFactory.getLogger(HomeController.class);
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(Locale locale, Model model){
		logger.info("Welcome to Taskify! The client locale is {}.", locale);
		
		return "home";
		
	}
	
}
