package com.example.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	@RequestMapping("details")
	public ModelAndView EmployeeDetails(details detail)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("det", detail);
		mv.setViewName("details.jsp");
		return mv;
	}	
	@RequestMapping("display")
	public ModelAndView display(details detail,@RequestParam("basic")int b,@RequestParam("allowance") int a)
	{
		detail.setSalary(a+b);
		ModelAndView mv2=new ModelAndView();
		mv2.addObject("dis", detail);
		mv2.setViewName("display.jsp");
		return mv2;
	}

}
