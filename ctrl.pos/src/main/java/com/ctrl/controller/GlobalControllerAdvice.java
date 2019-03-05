package com.ctrl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GlobalControllerAdvice extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// uname
		/*
		 * HttpSession session = request.getSession(true); String path =
		 * request.getRequestURI(); //System.out.println(" Path ---------------> " +
		 * request.getRequestURI()); if(path.equals("/ctrlaihub/") ||
		 * path.equals("/ctrlaihub/login1")) { session = request.getSession(true);
		 * System.out.println("name value --> " + request.getParameter("username"));
		 * session.setAttribute("name", request.getParameter("username")); } else {
		 * session = request.getSession(false);
		 * System.out.println("UName in Else-------------> " +
		 * session.getAttribute("uname"));
		 * System.out.println("Name in Else-------------> " +
		 * session.getAttribute("name")); }
		 */
		String path = request.getRequestURI();
		HttpSession session; 
		
		if (!(path.equals("/ctrlaihub/") || path.equals("/ctrlaihub/dashAssets/**"))) {
			System.out.println(" Path ----------------> " + path);
			System.out.println("Hi Hello");
			//session = request.getSession(false);
			//System.out.println("UName in Else-------------> " +session.getAttribute("uname"));
			if (request.getSession(false) == null || request.getSession(false).getAttribute("uname") == null
					|| request.getSession(false).getAttribute("uname") == "") {
				response.sendRedirect("C:\\Users\\CtrlAiHub\\git\\pointofsale\\ctrl.pos\\src\\main\\webapp\\views\\login1.jsp");	
				
				return false;
			}
		//	System.out.println("name value --> " + request.getParameter("username"));
		//	session.setAttribute("name", request.getParameter("username"));
		}
		return true;
	}
}

/*
 * import org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.ControllerAdvice; import
 * org.springframework.web.bind.annotation.InitBinder; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.SessionAttribute;
 * 
 * import com.ctrl.domains.Employee;
 */

/*
 * @ControllerAdvice(basePackages = {"com.ctrl.controller"}) public class
 * GlobalControllerAdvice {
 * 
 * @InitBinder public void show(@SessionAttribute("SessionUser") Employee user)
 * { System.out.println("IAM HERE Name ----> " + user.getName() +
 * " Password ----> " + user.getPassword());
 * System.out.println("IMAM HERER1 ST "); }
 * 
 * @ModelAttribute public void globalAttributes(Model model) {
 * model.addAttribute("msg", "Welcome to My World!"); } }
 */