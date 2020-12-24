package com.pradeep.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
	@GetMapping(value = "/")
	public String welcomeScreen(Model model) {
		return "index";
	}
}