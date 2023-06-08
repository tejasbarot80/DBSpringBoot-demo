package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class staffcontroller 
{
	@Autowired
	staffservice sd;
	
	@RequestMapping("/")
  public String one()
  {
		
	  return "index";
  }
	
	@PostMapping("/reg")
	public String two(@ModelAttribute("st") staff st)
	{
		sd.register(st);
		return "redirect:/welcome";
	}
	
	@RequestMapping("/welcome")
	  public String welcome()
	  {
			
		  return "welcome";
	  }
}
