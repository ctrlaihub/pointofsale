package com.ctrl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ctrl.domains.Address;
import com.ctrl.domains.User;
import com.ctrl.domains.stock.Category;
import com.ctrl.domains.stock.Product;
import com.ctrl.service.CategoryService;
import com.ctrl.service.ProductService;
import com.ctrl.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/")
	public String home(HttpSession session, HttpServletRequest request,HttpServletResponse response) {
		String sid = session.getId();
		System.out.println(" sid------------> " + sid);
		//HttpSession sessionObj = request.getSession(true);
		//sessionObj.setMaxInactiveInterval(7);
		//int timeout = sessionObj.getMaxInactiveInterval();
		// System.out.println(" TIMEOUT----------> " + timeout);
		//response.setHeader("Refresh", timeout + "; URL=login1.jsp");
		return "login1";
	}
	
	@RequestMapping(value = "/login1")
	public ModelAndView login1(@RequestParam("username") String userName,@RequestParam("password") String password, HttpServletRequest request) {
		//System.out.println(userName+password);
		User userResult = userService.findUserByEmail(userName,password);
		
		ModelAndView mv = new ModelAndView("login1");
		if (userResult != null) 
		{
			
			request.getSession().setAttribute("uname", userResult.getName());
			return new ModelAndView("redirect:/adminDash");
		}
		else 
		{
			String message = "<h4><font color = 'red'>" + "Sorry! Wrong Username/Password. Please Try Again. </font></h4>";
			mv.addObject("message", message);
			return mv;
		}
	}

	@RequestMapping(value = "/adminDash")
	public ModelAndView adminDash(HttpServletRequest request) {
		
		System.out.println("Get Attribute ----------->  " + request.getSession().getAttribute("uname"));
		if(request.getSession().getAttribute("uname")==null || request.getSession(false).getAttribute("uname")==""){
			return new ModelAndView("redirect:/");
		}
		
		ModelAndView mv = new ModelAndView("testing");
		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = "/viewEmployees")
	public ModelAndView employee() {
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("users", userService.listAllActiveUsers());
		mv.addObject("allusers", userService.listAllUsers());
		mv.addObject("userClickEmployee", true);
		return mv;
	}

	@RequestMapping(value = "/addEmployee")
	public ModelAndView addEmployee() {
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("userClickAddEmployee", true);
		return mv;
	}

	@RequestMapping(value = "/addEmployee1")
	public ModelAndView addEmployee1(@ModelAttribute("address") Address address, @ModelAttribute("user") User user) {
		user.setAddress(address);
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("result", userService.createUser(user));
		mv.addObject("userClickAddEmployee1", true);
		return mv;
	}

	@RequestMapping(value = "/viewStocks")
	public ModelAndView viewStocks() {
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("activestocks", productService.listAllActiveProducts());
		mv.addObject("userClickViewStock", true);
		return mv;
	}

	@RequestMapping(value = "/viewProducts")
	public ModelAndView viewProducts() {
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("products", productService.listAllProducts());
		mv.addObject("activeproducts", productService.listAllActiveProducts());
		mv.addObject("userClickViewProduct", true);
		return mv;
	}

	@RequestMapping(value = "/addProduct")
	public ModelAndView addProduct() {
		ModelAndView mv = new ModelAndView("adminDash");	
		mv.addObject("categoryList", categoryService.listAllCategory());	
		mv.addObject("userClickAddProduct", true);
		return mv;
	}

	@RequestMapping(value = "/addProduct1")
	public ModelAndView addProduct1(@ModelAttribute("product") Product product) {
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("addProduct", productService.createProduct(product));
		mv.addObject("userClickAddProduct", true);
		return mv;
	}

	@RequestMapping(value = "/addCategory")
	public ModelAndView addCategory() {
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("userClickAddCategory", true);
		return mv;
	}

	@RequestMapping(value = "/addCategory1")
	public ModelAndView addCategory1(@ModelAttribute("category") Category category) {
		ModelAndView mv = new ModelAndView("adminDash");
		boolean result = categoryService.addCategory(category);
		if (result) {
			String message = "<h4><font color = 'red'>" + category.getName()
					+ " category added Successfully.</font></h4>";
			mv.addObject("message", message);
			mv.addObject("userClickAddCategory1", true);
			return mv;
		} else
			return new ModelAndView("redirect:./shared/dashboard.jsp");
	}
}