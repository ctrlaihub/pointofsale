package com.ctrl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ctrl.domains.Address;
import com.ctrl.domains.CustAddress;
import com.ctrl.domains.Customer;
import com.ctrl.domains.User;
import com.ctrl.domains.stock.Category;
import com.ctrl.domains.stock.Product;
import com.ctrl.service.CategoryService;
import com.ctrl.service.CustomerService;
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

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/")
	public String home(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		String sid = session.getId();
		System.out.println(" sid------------> " + sid);
		// HttpSession sessionObj = request.getSession(true);
		// sessionObj.setMaxInactiveInterval(7);
		// int timeout = sessionObj.getMaxInactiveInterval();
		// System.out.println(" TIMEOUT----------> " + timeout);
		// response.setHeader("Refresh", timeout + "; URL=login1.jsp");
		return "login1";
	}

	@RequestMapping(value = "/login1")
	public ModelAndView login1(@RequestParam("username") String userName, @RequestParam("password") String password,
			HttpServletRequest request) {
		User userResult = userService.findUserByEmail(userName, password);
		String message = null;
		ModelAndView mv = new ModelAndView("login1");
		if (userResult != null) {
			mv = new ModelAndView("adminDash");
			mv.addObject("name", userResult.getName());
			mv.addObject("email", userResult.getEmail());
			request.getSession().setAttribute("uname", userResult.getName());
			mv.addObject("userClickHome", true);
			return mv;
		} else {
			message = "<h5><font color = 'red'>" + "Sorry! Wrong Username/Password. Please Try Again. </font></h5>";
			mv.addObject("message", message);
			return mv;
		}
	}

	@RequestMapping(value = "/adminDash")
	public ModelAndView adminDash(HttpServletRequest request) {

		System.out.println("Get Attribute ----------->  " + request.getSession().getAttribute("uname"));
		if (request.getSession().getAttribute("uname") == null
				|| request.getSession(false).getAttribute("uname") == "") {
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

	@RequestMapping(value = "/addCustomer")
	public ModelAndView addCustomer() {
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("userClickAddCustomer", true);
		return mv;
	}

	@RequestMapping(value = "/addCustomer1")
	public ModelAndView addCustomer1(@ModelAttribute("address") CustAddress address,
			@ModelAttribute("customer") Customer customer) {
		customer.setAddress(address);
		ModelAndView mv = new ModelAndView("adminDash");
		boolean result = customerService.addCustomer(customer);
		if (result) {
			String message = "<h4><font color = 'red'>" + customer.getCustName()
					+ "  - Customer added Successfully.</font></h4>";
			mv.addObject("message", message);
			mv.addObject("userClickAddCustomer1", true);
			return mv;
		} else
			return new ModelAndView("redirect:./shared/dashboard.jsp");
	}

	@RequestMapping(value = "/viewCustomer")
	public ModelAndView viewCustomer() {
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("userViewCustomer", true);
		return mv;
	}

	@RequestMapping(value = "/viewCustomer1")
	public ModelAndView viewCustomer1(@RequestParam("mobile") long mobile) {
		ModelAndView mv = new ModelAndView("adminDash");
		Customer cc = customerService.listAllCustomers(mobile);
		System.out.println("Customer Object for View" + cc);
		mv.addObject("customers", customerService.listAllCustomers(mobile));
		mv.addObject("userViewCustomer1", true);
		return mv;
	}

	@RequestMapping(value = "/editCustomer")
	public ModelAndView editCustomer(@RequestParam("custId") String custId, @RequestParam("custName") String custName,
			@RequestParam("email") String email, @RequestParam("mobile") long mobile,
			@RequestParam("street") String street, @RequestParam("city") String city,
			@RequestParam("street") String state, @RequestParam("zipcode") long zipcode,
			@RequestParam("addressid") long addressid) {
		CustAddress ad = new CustAddress();
		ad.setAddressid(addressid);
		ad.setCity(city);
		ad.setState(state);
		ad.setStreet(street);
		ad.setZipcode(zipcode);
		Customer cs = new Customer();
		cs.setId(custId);
		cs.setCustName(custName);
		cs.setCustMobileNo(mobile);
		cs.setEmail(email);
		cs.setAddress(ad);
		ModelAndView mv = new ModelAndView("adminDash");
		mv.addObject("customer", cs);
		mv.addObject("userClickEditCustomer", true);
		return mv;
	}

	@RequestMapping(value = "/editCustomer1")
	public ModelAndView editCustomer1(@ModelAttribute("customer") Customer customer) {
		ModelAndView mv = new ModelAndView("adminDash");
		Customer customer1 = customerService.updateCustomer(customer);
		System.out.println(customer1.getAddress());
		if (customer1!=null) {
			String message = "<h4><font color = 'red'>" + customer.getCustName() + " Updated Successfully.</font></h4>";
			mv.addObject("message", message);
			mv.addObject("customers", customer1);
			mv.addObject("userViewCustomer1", true);
			return mv;
		} else
			return new ModelAndView("redirect:./shared/dashboard.jsp");
	}

	/*
	 * @RequestMapping(value = "/TESTeditCustomer", method = RequestMethod.POST,
	 * consumes = MediaType.APPLICATION_JSON_VALUE)
	 * 
	 * @ResponseBody public ModelAndView editCustomer() { Customer customer = new
	 * Customer(); System.out.println("TEST EDIT Customer"); //
	 * System.out.println(customer); System.out.println(customer.getAddress());
	 * System.out.println(customer.getEmail());
	 * System.out.println(customer.getCustType());
	 * System.out.println("Mobile Number --> " + customer.getCustMobileNo());
	 * System.out.println("Customer Name --> " + customer.getCustName());
	 * System.out.println("Iam here-->"); ModelAndView mv = new
	 * ModelAndView("adminDash"); // mv.addObject("customer", customer);
	 * System.out.println("Iam here1-->"); mv.addObject("userClickHome", true);
	 * System.out.println("Iam here2-->"); return mv; }
	 * 
	 * @RequestMapping(value = "/TESTeditCustomer1") public ModelAndView
	 * TesteditCustomer1(@ModelAttribute("customer") Customer customer) {
	 * System.out.println("TEST EDIT Customer1"); ModelAndView mv = new
	 * ModelAndView("adminDash"); boolean result =
	 * customerService.updateCustomer(customer); if (result) { String message =
	 * "<h4><font color = 'red'>" + customer.getCustName() +
	 * " Updated Successfully.</font></h4>"; mv.addObject("message", message);
	 * mv.addObject("customers", customer); mv.addObject("userViewCustomer1", true);
	 * return mv; } else return new ModelAndView("redirect:./shared/dashboard.jsp");
	 * }
	 */
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