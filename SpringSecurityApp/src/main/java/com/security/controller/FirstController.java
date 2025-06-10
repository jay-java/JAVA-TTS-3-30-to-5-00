package com.security.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class FirstController {

	@GetMapping("/")
	public String msg(HttpServletRequest request) {
		// this will gives you return session id from browser network tab by inspecting
		return "app running : " + request.getSession().getId();
//		return "app running";
	}
	
	 //we will return token from here and send
    @GetMapping("/csrf-token")
    public CsrfToken getCSRFToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
