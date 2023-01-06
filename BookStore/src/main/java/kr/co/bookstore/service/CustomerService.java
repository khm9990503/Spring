package kr.co.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.dao.CustomerDAO;
import kr.co.bookstore.vo.CustomerVO;

/*
 * 날짜 : 2023/01/06
 * 이름 : 구홍모
 * 내용 : 모던 웹 애플리케이션 개발2
 * */

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	
	public void insertCustomer(CustomerVO vo) {
		dao.insertCustomer(vo);
	}
	public CustomerVO selectCustomer(String cusid) {
		return dao.selectCustomer(cusid);
	}
	public List<CustomerVO> selectCustomers() {
		return dao.selectCustomers();
	}
	public void updateCustomer(CustomerVO vo) {
		dao.updateCustomer(vo);
	}
	public void deleteCustomer(String cusid) {
		dao.deleteCustomer(cusid);
	}
}
