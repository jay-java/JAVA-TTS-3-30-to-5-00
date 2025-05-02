package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.UserDao;
import com.model.User;

@Controller
public class UserController {
	
	@Autowired
	private UserDao dao;
	
//	@RequestMapping("/")
//	public String indexPage(Model m) {
//		m.addAttribute("num", 1233);
//		m.addAttribute("list",List.of("one",1234,'f',245645,46.45));
//		return "index";
//	}
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
//	@RequestMapping(value ="/save",method = RequestMethod.POST)
//	public void insertUser(@RequestParam("name") String name,
//			@RequestParam("contact") long contact) {
//		this.dao.saveOrUpdateUser();
//	}
	
	@RequestMapping(value ="/save",method = RequestMethod.POST)
	public void insertUser(@ModelAttribute User u) {
		this.dao.saveOrUpdateUser(u);
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
}
