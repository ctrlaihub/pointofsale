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
	public String adminDash(){
		return "adminDash";
	}
	
	@RequestMapping(value="/employee")
	public ModelAndView employee(){
		ModelAndView mv=new ModelAndView("adminDashboard");
		mv.addObject("userClickEmployee", true);
		return mv;
	}
	
	@RequestMapping(value="/listAllEmployees")
	public ModelAndView listAllEmployees(){
		ModelAndView mv=new ModelAndView("adminDashboard");
		mv.addObject("lists", userService.listAllUsers());
		mv.addObject("userClickListAllEmployee", true);
		return mv;
	}
}
