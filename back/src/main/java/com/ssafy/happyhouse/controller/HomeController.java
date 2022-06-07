package com.ssafy.happyhouse.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
@CrossOrigin(
	    // localhost:5500 과 127.0.0.1 구분
	    origins = "http://localhost:5500", // allowCredentials = "true" 일 경우, orogins="*" 는 X
	    allowCredentials = "true", 
	    allowedHeaders = "*", 
	    methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.HEAD,RequestMethod.OPTIONS}
	)
public class HomeController {
	
	@GetMapping(value="/")
	public String index() {
		return "index.html";
	}
	
	@GetMapping(value="/mypage")
	public String mypage() {
		return "mypage.html";
	}
	
	@GetMapping(value="/login")
	public String login() {
		return "login.html";
	}
	
	@GetMapping(value="/register")
	public String register() {
		return "register.html";
	}
	

	@GetMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate(); //server의 session 정리
		return "login.html"; //client의 sessionStorage 정리
	}
	
	@GetMapping(value="/notice")
	public String notice(HttpSession session) {
		return "/board/boardMain.html";
	}
	@GetMapping(value="/shop")
	public String shops() {
		return "/myArea/shop.html";
	}
}
