package com.ctrl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String home(){
		return "login";
	}
	
	@RequestMapping(value="/adminDashboard")
	public String adminDash(){
		return "adminDashboard";
	}
}
