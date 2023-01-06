package kr.co.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.dao.BookDAO;
import kr.co.bookstore.vo.BookVO;

/*
 * 날짜 : 2023/01/06
 * 이름 : 구홍모
 * 내용 : 모던 웹 애플리케이션 개발2
 * */

@Service
public class BookService {

	@Autowired
	private BookDAO dao;
	
	public void insertBook(BookVO vo) {
		dao.insertBook(vo);
	}
	public BookVO selectBook(String bookId) {
		return dao.selectBook(bookId);
	}
	public List<BookVO> selectBooks() {
		return dao.selectBooks();
	}
	public void updateBook(BookVO vo) {
		dao.updateBook(vo);
	}
	public void deleteBook(String bookId) {
		dao.deleteBook(bookId);
	}
}
