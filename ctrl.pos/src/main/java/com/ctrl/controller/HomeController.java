package com.ctrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ctrl.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/")
	public String home(){
		return "login";
	}
	
	@RequestMapping(value="/adminDash")
	public ModelAndView adminDash(){
		ModelAndView mv=new ModelAndView("adminDash");
		mv.addObject("userClickHome", true);
		return mv;		
	}
	
	@RequestMapping(value="/viewEmployees")
	public ModelAndView employee(){
		ModelAndView mv=new ModelAndView("adminDash");
		mv.addObject("users",userService.listAllActiveUsers());
		mv.addObject("allusers",userService.listAllUsers());
		mv.addObject("userClickEmployee", true);
		return mv;
	}
	
}
