package com.ssafy.happyhouse.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.happyhouse.model.UserDto;

//@Controller
public class tempLoginController {

	@GetMapping(value = "/login")
	@ResponseBody
	public ResponseEntity<Map<String, String>> login(UserDto dto, HttpSession session) {

		UserDto userDto = new UserDto();
		userDto.setIsAdmin(1);
		userDto.setUserSeq(1);
		userDto.setUserName("관리자");
		userDto.setUserProfileImageUrl("/img/apt.png");
		Map<String, String> map = new HashMap<>();
		session.setAttribute("userDto", userDto);

		map.put("result", "success"); // 성공메시지
		map.put("userName", userDto.getUserName());
		map.put("userProfileImageUrl", userDto.getUserProfileImageUrl());
		return new ResponseEntity<Map<String, String>>(map, HttpStatus.OK);
	}
	
	@GetMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "/index.html";
	}
	
	@GetMapping(value="/notice")
	public String notice(HttpSession session) {
		return "/board/boardMain.html";
	}
}
