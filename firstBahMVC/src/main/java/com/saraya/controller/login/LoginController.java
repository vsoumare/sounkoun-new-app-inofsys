package com.saraya.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.saraya.controller.service.authentication.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	
	
	public String showLoginPage() {
		return "login";
	}
	
	
@RequestMapping(value="/login", method = RequestMethod.POST)
	
	public String showWelcomePage(ModelMap model, @RequestParam String username,
									@RequestParam String password) {
	if(!loginService.isValid(username, password)) {
		return "login";
	}else {
		
		model.put("name", username);
		
		return "welcome";
	}
	
		
	}	

}
