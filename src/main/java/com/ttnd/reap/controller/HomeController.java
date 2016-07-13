package com.ttnd.reap.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.GivingKitty;
import com.ttnd.reap.model.RecievedKitty;
import com.ttnd.reap.model.User;
import com.ttnd.reap.model.WallOfFame;
import com.ttnd.reap.service.IUserService;
import com.ttnd.reap.service.impl.UserServiceImpl;

@Controller
public class HomeController {
	
	private IUserService userService;

	@Autowired
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
//	// @RequestMapping(value = "/", method = RequestMethod.GET)
//	@RequestMapping(method = RequestMethod.GET)
//	public String home() {
//		return "home";
//	}
//	
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public String getEmployeeDetails(@ModelAttribute("userForm") EmployeeDetails employee, Map<String, Object> model){
//		 return "RegistrationSuccess";
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		
		return new ModelAndView("register","command",new Employee());
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView indexSame() {
		
		return new ModelAndView("register","command",new Employee());
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("register") Employee employee,
			/*BindingResult result*/ ModelMap model/* final RedirectAttributes redirectAttributes*/) {
			
			System.out.println(employee.getName() + " " + employee.getEmail());
			model.addAttribute(employee);
		//	userService.save(user);
			userService.saveEmpl(employee);
			model.addAttribute("msg", "welcome to reap");
			return new ModelAndView("show","command",employee);//"command",user);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginSame() {
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/login" , method= RequestMethod.POST)
	public ModelAndView loginCheck(@RequestParam String email, @RequestParam String password){
		Employee user = new Employee();
		user = userService.findEmplById(email, password);
		if(user == null)
			return new ModelAndView("/login","command",new Employee());
		else
			return new ModelAndView("index");
		
	}
	
	
	
	// show user
		@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
		public String showUser(@PathVariable("id") int id, Model model) {

			User user = userService.findById(id);
			if (user == null) {
				model.addAttribute("css", "danger");
				model.addAttribute("msg", "User not found");
			}
			model.addAttribute("user", user);

			return "users/show";

		}

}
