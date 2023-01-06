package kr.co.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * 날짜 : 2023/01/06
 * 이름 : 구홍모
 * 내용 : 모던 웹 애플리케이션 개발2
 * */

@Controller
public class MainController {

	@GetMapping(value = {"/","/index"})
	public String index() {
		return "/index";
	}
}
