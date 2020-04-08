package com.quizmaster.maven.myquizmaster.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quizmaster.maven.myquizmaster.service.LoginService;

@Controller
public class LoginController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
		
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		
		LoginService login = new LoginService();
		int sum = login.add(a,b);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginsuccessful.jsp");
		mv.addObject("result",sum);
		return mv;
	}
}
