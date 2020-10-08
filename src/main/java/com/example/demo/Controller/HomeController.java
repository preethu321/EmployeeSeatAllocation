package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.EmployeeDao;
import com.example.demo.MODEL.Employee;


@Controller
public class HomeController {
	@Autowired
	private EmployeeDao empDao;
	
	@RequestMapping("home")
	public String homePage(Model model) {
		model.addAttribute("employee", new Employee());
		return "home";
	}
	
	@PostMapping("/addEmployeee")
	public String addEmployeee(Employee employee) {
		return "home";
	}

}
