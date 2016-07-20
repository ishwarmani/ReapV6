package com.ttnd.reap.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ttnd.reap.dao.util.NewerBoard;
import com.ttnd.reap.dao.util.RecognizeKarmaCopy;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.service.IEmployeeService;
import com.ttnd.reap.service.IRecognizeKarmaService;

@Controller
public class AdminController {

	@Autowired
	private IEmployeeService employeeService;
	@Autowired
	private IRecognizeKarmaService recognizeKarmaService;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminGet(HttpSession session) {

		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return "login";
		}
		else{
			List<NewerBoard> newerBoard = employeeService.getNewerList();
			session.setAttribute("loggedInUser", employee);
			session.setAttribute("newerBoard", newerBoard);
			List<RecognizeKarmaCopy> recKarma = employeeService.getEmplList();
			session.setAttribute("recKarma", recKarma);
		}
		return "admin";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String adminPost(HttpSession session){
		
		Employee employee = (Employee) session.getAttribute("loggedInUser");
		if (employee == null) {
			return "login";
		}else{
			
		}
		
		return null;
	}
}
