package kr.co.bookstore.dao;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.vo.CustomerVO;

/*
 * 날짜 : 2023/01/06
 * 이름 : 구홍모
 * 내용 : 모던 웹 애플리케이션 개발2
 * */

@Repository
public class CustomerDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertCustomer(CustomerVO vo) {
		mybatis.insert("customer.insertCustomer",vo);
	}
	public CustomerVO selectCustomer(String cusid) {
		return mybatis.selectOne("customer.selectCustomer",cusid);
	}
	public List<CustomerVO> selectCustomers() {
		return mybatis.selectList("customer.selectCustomers");
	}
	public void updateCustomer(CustomerVO vo) {
		mybatis.update("customer.updateCustomer",vo);
	}
	public void deleteCustomer(String cusid) {
		mybatis.delete("customer.deleteCustomer",cusid);
	}
}
