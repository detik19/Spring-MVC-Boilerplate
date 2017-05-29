package com.embeddednesia.springmvc.web.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;





@Controller
public class TaskController {
	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
	public String newTaskForm(Model model) {

		//model.addAttribute("task", new Task());
		// model.addAttribute("priorities", priorities);
		// model.addAttribute("users", userService.findAllUsers());
		return "new";
	}
	
	

}
