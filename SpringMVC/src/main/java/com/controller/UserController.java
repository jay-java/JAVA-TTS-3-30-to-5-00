package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public String insertUser(@ModelAttribute User u,Model m) {
		this.dao.saveOrUpdateUser(u);
		List<User> list = this.dao.getAlllUser();
		m.addAttribute("list",list);
		return "home";
	}
	
	@RequestMapping("/home")
	public String homePage(Model m) {
		List<User> list = this.dao.getAlllUser();
		m.addAttribute("list",list);
		return "home";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editUser(@PathVariable("id") int id) {
		User u = this.dao.getUserByid(id);
		ModelAndView m = new ModelAndView();
		m.addObject("u", u);
		m.setViewName("update");
		return m;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id,Model m) {
		this.dao.deleteUser(id);
		List<User> list = this.dao.getAlllUser();
		m.addAttribute("list",list);
		return "home";
	}
}
