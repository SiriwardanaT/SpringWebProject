package com.SpringWebBackend.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
	@RequestMapping("home")
    public String home() {
    	return "home.jsp";
    }
}
