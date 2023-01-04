package kr.co.ch04.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class User1Controller {

	@GetMapping("/user1/register")
	public String register() {
		return "/user1/register";
	}
	@GetMapping("/user1/result")
	public String result() {
		return "/user1/result";
	}
	
	@PostMapping("/user1/register")
	public String register(Model model, HttpServletRequest req, String name, int age, String hp) { // 순서 상관 없음, 이름 중요
		String uid = req.getParameter("uid");
		
		System.out.println("uid : "+uid);
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		
		model.addAttribute("uid",uid);
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("hp",hp);
		
		return "/user1/result";
	}
	
	
}
