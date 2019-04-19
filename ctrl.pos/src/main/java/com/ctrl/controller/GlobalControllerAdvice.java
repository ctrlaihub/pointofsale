package com.ctrl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GlobalControllerAdvice extends HandlerInterceptorAdapter {

	HttpServletResponse response1;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		response1 = response;
		// boolean status = true;
		String path = request.getRequestURI();
		if (!path.equals("/ctrlaihub/login1"))
			if (!(path.equals("/ctrlaihub/")
					|| (path.equals("/ctrlaihub/") || path.equals("/ctrlaihub/dashAssets/images/hema%20logo.png")
							|| path.equals("/ctrlaihub/dashAssets/images/Grocery7.jpg")
							|| path.equals("/ctrlaihub/dashAssets/plugins/animate-css/animate.css")
							|| path.equals("/ctrlaihub/dashAssets/plugins/bootstrap/css/bootstrap.css")
							|| path.equals("/ctrlaihub/dashAssets/plugins/jquery/jquery.min.js")
							|| path.equals("/ctrlaihub/dashAssets/plugins/bootstrap/js/bootstrap.js")
							|| path.equals("/ctrlaihub/dashAssets/plugins/node-waves/waves.js")
							|| path.equals("/ctrlaihub/dashAssets/css/style.css")
							|| path.equals("/ctrlaihub/dashAssets/plugins/node-waves/waves.css")
							|| path.equals("/ctrlaihub/dashAssets/js/admin.js")
							|| path.equals("/ctrlaihub/dashAssets/js/pages/examples/sign-in.js")
							|| path.equals("/ctrlaihub/dashAssets/plugins/jquery-validation/jquery.validate.js") || path.equals("/ctrlaihub/timeout")))) {
				System.out.println("Hi Hello Path ----------------> " + path);
				if (request.getSession(false).getAttribute("uname") == null || request.getSession(false).getAttribute("uname") == "") {
					response.sendRedirect("/ctrlaihub");
					return false;
				}
			}
		return true;
	}
	/*
	 * public void postHandle(HttpServletRequest request, HttpServletResponse
	 * response, Object handler, ModelAndView modelAndView) { HttpSession ses =
	 * request.getSession();
	 * System.out.println(" Session Get Last Accessed Time ---> " +
	 * ses.getLastAccessedTime());
	 * System.out.println(" Get MaxInactiveInterval ----> " +
	 * ses.getMaxInactiveInterval()); }
	 */	
	/* request.getSession(false) == null || */
}