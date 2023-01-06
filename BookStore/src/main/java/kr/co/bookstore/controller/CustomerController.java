package kr.co.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookstore.service.CustomerService;
import kr.co.bookstore.vo.CustomerVO;

/*
 * 날짜 : 2023/01/06
 * 이름 : 구홍모
 * 내용 : 모던 웹 애플리케이션 개발2
 * */

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer/list")
	public String list(Model model) {
		
		List<CustomerVO> customers = service.selectCustomers();
		
		model.addAttribute("customers",customers);
		
		return "/customer/list";
	}
	
	@GetMapping("/customer/register")
	public String register() {
		
		return "/customer/register";
	}
	
	@PostMapping("/customer/register")
	public String register(CustomerVO vo) {
		
		service.insertCustomer(vo);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/modify")
	public String modify(Model model, String cusid) {
		
		CustomerVO customer = service.selectCustomer(cusid);
		
		model.addAttribute("customer",customer);
		
		return "/customer/modify";
	}
	
	@PostMapping("/customer/modify")
	public String modify(CustomerVO vo) {
		
		service.updateCustomer(vo);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/delete")
	public String delete(String cusid) {
		service.deleteCustomer(cusid);
		
		return "redirect:/customer/list";
	}
}
