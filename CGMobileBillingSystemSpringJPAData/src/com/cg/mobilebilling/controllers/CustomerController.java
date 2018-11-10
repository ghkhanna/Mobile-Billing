package com.cg.mobilebilling.controllers;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.cg.mobilebilling.beans.Customer;
import com.cg.mobilebilling.exceptions.BillingServicesDownException;
import com.cg.mobilebilling.services.BillingServices;
@Controller
public class CustomerController {
	@Autowired
	private BillingServices billingServices;
	
	@RequestMapping("/registerCustomer")
	public ModelAndView registerAccountAction(@Valid @ModelAttribute Customer customer, BindingResult result) throws BillingServicesDownException {
		if(result.hasErrors())
			return new ModelAndView("registrationPage");
		customer = billingServices.acceptCustomerDetails(customer);
		return new ModelAndView("registrationSuccessPage", "customer", customer);
	}
	
	@RequestMapping("/deleteCustomer")
	public ModelAndView deleteCustomerAction() {
		return null;
	}
	
	/*public ModelAndView depositAmountAction(@RequestParam("accountNo") String accountNo,@RequestParam("amount") String amount) throws AccountNotFoundException, BankingServicesDownException, NumberFormatException, AccountBlockedException{
		Account account = bankingServices.depositAmount(Long.parseLong(accountNo), Float.parseFloat(amount));
		return new ModelAndView("depositSuccessPage", "account", account);
	}*/
}