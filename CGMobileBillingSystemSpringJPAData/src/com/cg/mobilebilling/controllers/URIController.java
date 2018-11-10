package com.cg.mobilebilling.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.mobilebilling.beans.Customer;
@Controller
public class URIController {
	@RequestMapping("/")
	public String getIndexPage() {
		return "indexPage";
	}
	
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "registrationPage";
	}
	
	@RequestMapping("/login")
	public String getLoginPage() {
		return "loginPage";
	}
	
	@RequestMapping("/plan")
	public String getPlanPage() {
		return "planPage";
	}
	
	@RequestMapping("/delete")
	public String getDeletePage() {
		return "deletePage";
	}
	
	@ModelAttribute
	public Customer getCustomer() {
		Customer customer = new Customer();
		return customer;
	}
}
