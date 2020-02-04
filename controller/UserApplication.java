package com.mindgate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class UserApplication {

@RequestMapping("/applicationForm")
public String show(){
	return "userApplication-Form";
}
@RequestMapping("/confirmationForm")
public String display(){
	return "userApplication-confirmation";
}
@RequestMapping("home/userApplication-confirmation")
public String disp(){
	return "redirect:/";
}
}
