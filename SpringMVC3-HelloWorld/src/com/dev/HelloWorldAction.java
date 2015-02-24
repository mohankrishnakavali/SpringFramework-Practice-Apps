package com.dev;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldAction {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView sayHello(Model model){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello");
		model.addAttribute("HelloMessage", "Hello world this is my first MVC3 application");	
		return mv;
	}
}
