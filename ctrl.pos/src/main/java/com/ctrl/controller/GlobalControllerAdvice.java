package com.ctrl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GlobalControllerAdvice extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String path = request.getRequestURI();
		if (!path.equals("/ctrlaihub/login1"))
			if (!path.equals("/ctrlaihub/")) {
				System.out.println("Hi Hello Path ----------------> " + path);
				if (request.getSession(false) == null || request.getSession(false).getAttribute("uname") == null
						|| request.getSession(false).getAttribute("uname") == "") {
					response.sendRedirect("/ctrlaihub/");
					return false;
				}
			}
		return true;
	}
}