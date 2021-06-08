package com.ashwin.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="user", required=false, defaultValue="World") String user, Model model) {
		model.addAttribute("name", user);
		return "greeting";
	}

	@GetMapping("/home")
	public String home(@RequestParam(name="user", required=false, defaultValue="World") String user, Model model) {
		model.addAttribute("name", user);
		String today = new Date().toString();
		model.addAttribute("date", today);
		return "home";
	}
}