package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Programmer.demoProgrammer;

@Controller
public class MainController {

	@ModelAttribute
	public void display(Model m)
	{
		m.addAttribute("msg","Wellcome to spring boot tutorial");
	}
	@RequestMapping("/home")
	 public String homePage()
	 {
		return "HomePage.html";
	 }
	
	@RequestMapping("/User_info")
	 public ModelAndView User_information(@ModelAttribute demoProgrammer programmer)	 
	 {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("User_info.html");
		
		return mv;
	 }
}
