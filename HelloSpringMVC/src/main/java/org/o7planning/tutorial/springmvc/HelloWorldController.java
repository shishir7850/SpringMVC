package org.o7planning.tutorial.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller 
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("greeting", "Hello Spring MVC");
		return "helloworld";
	}
	
	@RequestMapping("/form")
	public String form(Model model) {
		return "form";
	}
	
	@RequestMapping("/action")
	public void action(Model model, HttpServletRequest request) {
		System.out.println(request.getParameter("fullname"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("city"));
		System.out.println(request.getParameter("phone"));
		System.out.println(request.getParameter("email"));
	}
}	
	