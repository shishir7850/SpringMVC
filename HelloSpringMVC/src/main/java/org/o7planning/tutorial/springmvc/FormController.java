package org.o7planning.tutorial.springmvc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;

import org.o7planning.tutorial.model.Person;
import org.o7planning.tutorial.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FormController {
	//@Autowired
	//FormRepository formRepos;
	
	/*@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Hello Spring MVC");
		return "helloworld";
	}*/
	
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

		
	Person emp = new Person(request.getParameter("fullname"), request.getParameter("address"), request.getParameter("city"), 
			request.getParameter("phone"), request.getParameter("email"));
	
		
	}
	
	 

}
