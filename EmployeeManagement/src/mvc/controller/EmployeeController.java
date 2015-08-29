package mvc.controller;

import mvc.form.EmployeeForm;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class EmployeeController {

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
	EmployeeForm employeeForm, BindingResult result) {
		
		System.out.println("First Name:" + employeeForm.getFirstname() + 
					"Last Name:" + employeeForm.getLastname());
		EmployeeForm addEmployee=new EmployeeForm();
		addEmployee.setFirstname(employeeForm.getFirstname());
		addEmployee.setLastname(employeeForm.getLastname());
		addEmployee.setEmail(employeeForm.getEmail());
		addEmployee.setTelephone(employeeForm.getTelephone());
		
		return "redirect:registration.html";
	}
	
	@RequestMapping("/contacts")
	public ModelAndView showContacts() {
		
		return new ModelAndView("registration", "command", new EmployeeForm());
	}
}
