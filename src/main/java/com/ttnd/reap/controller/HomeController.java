
package com.ttnd.reap.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.RecognizeKarma;
import com.ttnd.reap.service.IEmployeeService;

@Controller
public class HomeController {

	private IEmployeeService employeeService;

	@Autowired
	public void setUserService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpSession session) {
		
		//System.out.println(session.getAttribute("loggedInUser"));
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return "login";
		}
		return "redirect:index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView indexSame(HttpSession session) {
		Employee user = (Employee) session.getAttribute("loggedInUser");
		if (user == null) {
			return new ModelAndView("register", "command", new Employee());
		}
		return new ModelAndView("redirect:index");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("register") Employee employee, Model model, HttpSession session) {
		
		if (employee == null) {
			return new ModelAndView("register");
		}
		employeeService.register(employee);
		session.setAttribute("loggedInUser", employee);
		return new ModelAndView("redirect:index", "karma", new RecognizeKarma());
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginSame(HttpSession session) {
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return new ModelAndView("login");
		}
		return new ModelAndView("redirect:index");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginCheck(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session, Model model) {
		Employee employee;
		employee = employeeService.login(email, password);
		System.out.println(employee);
		if (employee == null) {
			return new ModelAndView("login");
		} else {
			session.setAttribute("loggedInUser", employee);
			return new ModelAndView("redirect:index", "karma", new RecognizeKarma());
		}

	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView IndexSame(HttpSession session) {
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return new ModelAndView("redirect:login");
		}
		return new ModelAndView("index", "karma",new RecognizeKarma());
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String Logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
	
	// @RequestMapping(value = "/index1", method = RequestMethod.POST)
	// public String loginCheck(@RequestParam String email, @RequestParam String
	// password, HttpServletRequest request) {
	//
	// HttpSession session = request.getSession(false);
	//
	// if(session==null || session.getAttribute("loggedInUser")==null){
	// //redirect to login
	// return "show";
	// }
	//
	// }
	// show user
	// @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	// public String showUser(@PathVariable("id") int id, Model model) {
	//
	// User user = userService.findById(id);
	// if (user == null) {
	// model.addAttribute("css", "danger");
	// model.addAttribute("msg", "User not found");
	// }
	// model.addAttribute("user", user);
	//
	// return "users/show";
	//
	// }

}
