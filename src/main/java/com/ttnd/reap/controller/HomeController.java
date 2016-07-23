
package com.ttnd.reap.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ttnd.reap.dao.util.NewerBoard;
import com.ttnd.reap.dao.util.RecognizeKarmaCopy;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.GivingBadges;
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
		// data = employeeService.getEmployeeSearchResults();
		if (user == null) {
			return new ModelAndView("register", "employee", new Employee());
		}
		return new ModelAndView("redirect:index");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("register") Employee employee, Model model, HttpSession session) {

		Employee employeeSession = (Employee) session.getAttribute("loggedInUser");
		ModelAndView modelAndView = new ModelAndView();
		if (employeeSession != null) {
			session.setAttribute("employee", employee);
			modelAndView.setViewName("redirect:index");
			return modelAndView;
		}

		boolean flag = employeeService.register(employee);
		if (flag) {
			session.setAttribute("loggedInUser", employee);
			// List<NewerBoard> newerBoard = employeeService.getNewerList();
			// session.setAttribute("newerBoard", newerBoard);
			// modelAndView.addObject("newerBoard", newerBoard);
			// List<RecognizeKarmaCopy> recKarma =
			// employeeService.getEmplList();
			// session.setAttribute("recKarma", recKarma);
			// modelAndView.addObject("recKarma", recKarma);
			modelAndView.setViewName("redirect:index");
			return modelAndView;
		} else {
			modelAndView.addObject("msg", "Something went wrong! Please try again.");
			modelAndView.setViewName("register");
			modelAndView.addObject("employee", new Employee());
			return modelAndView;
		}

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
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		System.out.println(employee);
		if (employee != null) {
			session.setAttribute("loggedInUser", employee);
			return new ModelAndView("redirect:index");
		}

		// data = employeeService.getEmployeeSearchResults();
		employee = employeeService.login(email, password);
		System.out.println(employee);

		if (employee == null) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("msg", "Sorry !     your credentials does not match as in our Database. Try again.");
			modelAndView.setViewName("login");
			return modelAndView;
			// return new ModelAndView("login", "msg", "your credentials does
			// not match as in our Database");
		} /*
			 * else if (employee.getUserRole().equals("admin")) { return new
			 * ModelAndView("redirect:admin");
			 */
		// }
		else {
			session.setAttribute("loggedInUser", employee);
			return new ModelAndView("redirect:index");
		}

	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView IndexSame(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return new ModelAndView("redirect:login");
		}
		data = employeeService.getEmployeeSearchResults();
		List<NewerBoard> newerBoard = employeeService.getNewerList();
		List<RecognizeKarmaCopy> recKarma = employeeService.getEmplList();
		GivingBadges givingBadges = employeeService.getGivingKittyInfo(employee.getGivingBadges().getGivBadgeId());
		RecievedBadges recievedBadges = employeeService
				.getRecievedKittyInfo(employee.getRecievedBadges().getRecBadgeId());
		session.setAttribute("loggedInUser", employee);
		modelAndView.addObject("newerBoard", newerBoard);
		modelAndView.addObject("recKarma", recKarma);
		modelAndView.addObject("karma", new RecognizeKarma());
		modelAndView.addObject("givingBadges", givingBadges);
		modelAndView.addObject("recievedBadges", recievedBadges);
		modelAndView.setViewName("index");

		return modelAndView;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String Logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}

	@RequestMapping(value = "/karma", method = RequestMethod.POST)
	public ModelAndView recognizeKarma(@ModelAttribute("karma") RecognizeKarma recognizeKarma, HttpSession session) {

		String recieverId = recognizeKarma.getRecieverId().split(",")[1];
		recognizeKarma.setRecieverId(recieverId);
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		ModelAndView modelAndView = new ModelAndView();
		if (employee == null) {
			modelAndView.addObject("msg", "login is required");
			modelAndView.setViewName("redirect:login");
			return modelAndView;
		}

		recognizeKarma.setSenderId(employee.getEmployeeId());
		recognizeKarmaService.setRecognizeKarma(recognizeKarma);
		// List<NewerBoard> newerBoard = employeeService.getNewerList();
		session.setAttribute("loggedInUser", employee);
		//
		// session.setAttribute("newerBoard", newerBoard);
		//
		// List<RecognizeKarmaCopy> recKarma = employeeService.getEmplList();
		//
		// session.setAttribute("recKarma", recKarma);
		modelAndView.setViewName("redirect:index");
		return modelAndView;

	}

	@RequestMapping(value = "/badge", method = RequestMethod.GET)
	public ModelAndView getRecievedBadges(HttpSession session) {
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return new ModelAndView("redirect:login");
		}
		RecievedBadges recievedBadges = employeeService.getRecievedKittyInfo(employee.getRecievedBadges().getRecBadgeId());
		ModelAndView model = new ModelAndView("badge");
		model.addObject("recievedBadges", recievedBadges);
		List<RecognizeKarmaCopy> allKarma = employeeService.getAllBadges(employee.getEmployeeId());
		List<RecognizeKarmaCopy> givKarma = employeeService.getGivenRecognizeKarmaValues(employee.getEmployeeId());
		List<RecognizeKarmaCopy> recKarma = employeeService.getRecievedRecognizeKarmaValues(employee.getEmployeeId());
		model.addObject("allBadges", allKarma);
		model.addObject("givBadges", givKarma);
		model.addObject("recBadges", recKarma);
//		model.addObject("allSize",allKarma.size());
//		model.addObject("givSize",givKarma.size());
//		model.addObject("recSize",recKarma.size());
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
	
	@RequestMapping(value = "/badges/user/{employeeId}")
	public ModelAndView employeeBadges(@PathVariable String employeeId, HttpSession session){
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		ModelAndView model = new ModelAndView();
		if (employee == null) {
			//modelAndView.addObject("msg", "login required");
			model.setViewName("redirect:login");
			return model;
		}
		RecievedBadges recievedBadges = employeeService.getRecievedKittyInfo(employeeId);
		
		model.addObject("recievedBadges", recievedBadges);
		List<RecognizeKarmaCopy> allKarma = employeeService.getAllBadges(employeeId);
		List<RecognizeKarmaCopy> givKarma = employeeService.getGivenRecognizeKarmaValues(employeeId);
		List<RecognizeKarmaCopy> recKarma = employeeService.getRecievedRecognizeKarmaValues(employeeId);
		model.addObject("allBadges", allKarma);
		model.addObject("givBadges", givKarma);
		model.addObject("recBadges", recKarma);
		model.setViewName("badge");
		return model;
	}

}
