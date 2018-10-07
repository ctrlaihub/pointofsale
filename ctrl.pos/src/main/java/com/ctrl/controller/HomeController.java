package com.ctrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ctrl.domains.User;
import com.ctrl.service.ProductService;
import com.ctrl.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
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
	
	@RequestMapping(value="/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute("user") User user){
		ModelAndView mv=new ModelAndView("adminDash");
		mv.addObject("result",userService.createUser(user));
		mv.addObject("userClickAddEmployee", true);
		return mv;
	}
	
	@RequestMapping(value="/viewStocks")
	public ModelAndView viewStocks(){
		ModelAndView mv=new ModelAndView("adminDash");
		mv.addObject("activestocks",productService.listAllActiveProducts());
		mv.addObject("userClickViewStock", true);
		return mv;
	}
	
	@RequestMapping(value="/viewProducts")
	public ModelAndView viewProducts(){
		ModelAndView mv=new ModelAndView("adminDash");
		mv.addObject("products",productService.listAllProducts());
		mv.addObject("activeproducts",productService.listAllActiveProducts());
		mv.addObject("userClickViewProduct", true);
		return mv;
	}
	
	//My Commit
	
}
