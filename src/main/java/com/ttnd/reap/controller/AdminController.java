package com.ttnd.reap.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ttnd.reap.dao.IAdminDao;
import com.ttnd.reap.dao.util.NewerBoard;
import com.ttnd.reap.dao.util.RecognizeKarmaCopy;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.RecognizeKarma;
import com.ttnd.reap.service.IAdminService;
import com.ttnd.reap.service.IEmployeeService;
import com.ttnd.reap.service.IRecognizeKarmaService;

@Controller
public class AdminController {

	@Autowired
	private IEmployeeService employeeService;
	@Autowired
	private IRecognizeKarmaService recognizeKarmaService;
	@Autowired
	private IAdminService adminService;
	
	List<Employee> data = new ArrayList<Employee>();
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminGet(HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return new ModelAndView("redirect:login");
		}
		if (employee != null && !employee.getUserRole().equals("Admin")) {
			session.setAttribute("loggedInUser", employee);
			return new ModelAndView("redirect:index");
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
		modelAndView.setViewName("admin");

		return modelAndView;
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public ModelAndView adminPost(@RequestParam("newerId") String newerId, 
								  @RequestParam("role") String role,HttpSession session,Model model){
		
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		newerId = newerId.split(",")[1];
		System.out.println(newerId);
		if (employee == null) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("msg", "Sorry !     your credentials does not match as in our Database. Try again.");
			modelAndView.setViewName("login");
			return modelAndView;
		}
		else{
			boolean flag = adminService.updateRole(newerId,role);
			System.out.println(flag);
		}
		
		return new ModelAndView("redirect:admin");
	}
	
	@RequestMapping(value = "/getEmployeeList", method = RequestMethod.GET)
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
