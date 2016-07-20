
package com.ttnd.reap.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ttnd.reap.dao.util.NewerBoard;
import com.ttnd.reap.dao.util.RecognizeKarmaCopy;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.RecognizeKarma;
import com.ttnd.reap.service.IEmployeeService;
import com.ttnd.reap.service.IRecognizeKarmaService;

@Controller
public class HomeController {
	@Autowired
	private IEmployeeService employeeService;
	@Autowired
	private IRecognizeKarmaService recognizeKarmaService;

	/*@Autowired
	public void setUserService(IEmployeeService employeeService, IRecognizeKarmaService recognizeKarmaService) {
		this.employeeService = employeeService;
		this.recognizeKarmaService = recognizeKarmaService;
	}*/

	List<Employee> data = new ArrayList<Employee>();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpSession session) {

		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return "login";
		}
		return "redirect:index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView indexSame(HttpSession session) {
		Employee user = (Employee) session.getAttribute("loggedInUser");
		data = employeeService.getEmployeeSearchResults();
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

		List<NewerBoard> newerBoard = employeeService.getNewerList();
		session.setAttribute("loggedInUser", employee);

		System.out.println(newerBoard.size());
		session.setAttribute("newerBoard", newerBoard);

		List<RecognizeKarmaCopy> recKarma = employeeService.getEmplList();

		session.setAttribute("recKarma", recKarma);

		return new ModelAndView("redirect:index", "karma", new RecognizeKarma());
		// return new ModelAndView("redirect:login");

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
		data = employeeService.getEmployeeSearchResults();

		employee = employeeService.login(email, password);
		// RecievedBadges rec = new RecievedBadges();
		if (employee == null) {
			return new ModelAndView("login");
		}
		else if(employee.getUserRole().equals("admin")){
			return new ModelAndView("redirect:admin");
		}
		 else {

			List<NewerBoard> newerBoard = employeeService.getNewerList();
			session.setAttribute("loggedInUser", employee);

			session.setAttribute("newerBoard", newerBoard);

			List<RecognizeKarmaCopy> recKarma = employeeService.getEmplList();

			session.setAttribute("recKarma", recKarma);
			return new ModelAndView("redirect:index", "karma", new RecognizeKarma());
		}

	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView IndexSame(HttpSession session) {
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return new ModelAndView("redirect:login");
		}
		session.setAttribute("employee", employee);
		return new ModelAndView("index", "karma", new RecognizeKarma());
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String Logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}

	@RequestMapping(value = "/karma", method = RequestMethod.POST)
	public ModelAndView recognizeKarma(@ModelAttribute("karma") RecognizeKarma recognizeKarma, HttpSession session) {
		// ModelAndView modelAndView = null;

		String recieverId = recognizeKarma.getRecieverId().split(",")[1];
		recognizeKarma.setRecieverId(recieverId);

		Employee employee = (Employee) session.getAttribute("loggedInUser");
		System.out.println(session);
		if (employee == null) {
			return new ModelAndView("redirect:login");
		}

		recognizeKarma.setSenderId(employee.getEmployeeId());
		recognizeKarmaService.setRecognizeKarma(recognizeKarma);

		// List<Employee> listEmploy = employeeService.employeeList();

		List<NewerBoard> newerBoard = employeeService.getNewerList();
		session.setAttribute("loggedInUser", employee);

		session.setAttribute("newerBoard", newerBoard);

		List<RecognizeKarmaCopy> recKarma = employeeService.getEmplList();

		session.setAttribute("recKarma", recKarma);

		return new ModelAndView("redirect:index", "karma", new RecognizeKarma());

	}

	@RequestMapping(value = "/badge", method = RequestMethod.GET)
	public ModelAndView getRecievedBadges(HttpSession session) {
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		RecievedBadges recieved = employeeService.getRecievedKittyInfo(employee.getRecievedBadges().getRecBadgeId());
		ModelAndView model = new ModelAndView("badge");
		model.addObject("recBadges", recieved);
		return model;

	}

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getEmployees(@RequestParam String name) {

		List<Employee> result = new ArrayList<Employee>();
		
		for (Employee employee : data) {

			if (employee.getEmployeeName().contains(name)) {
				result.add(employee);
			}
		}

		return result;
	}

}
