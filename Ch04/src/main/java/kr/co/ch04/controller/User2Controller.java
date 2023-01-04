package kr.co.ch04.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch04.vo.User2VO;

@Controller
public class User2Controller {
	
	@GetMapping("/user2/register")
	public String register() {
		return "/user2/register";
	}
	@GetMapping("/user2/result")
	public String result() {
		return "/user2/result";
	}
	
	@PostMapping("/user2/register")
	public String register(Model model, User2VO vo) { // 순서 상관 없음, 이름 중요
		
		
		model.addAttribute(vo);
		
		
		return "/user2/result";
	}
}
