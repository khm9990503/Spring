package kr.co.bookstore.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.vo.BookVO;
/*
 * 날짜 : 2023/01/06
 * 이름 : 구홍모
 * 내용 : 모던 웹 애플리케이션 개발2
 * */
@Repository
public class BookDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	// book 기본 CRUD
	
	public void insertBook(BookVO vo) {
		mybatis.insert("book.insertBook",vo);
	}
	public BookVO selectBook(String bookId) {
		return mybatis.selectOne("book.selectBook",bookId);
	}
	public List<BookVO> selectBooks() {
		return mybatis.selectList("book.selectBooks");
	}
	public void updateBook(BookVO vo) {
		mybatis.update("book.updateBook",vo);
	}
	public void deleteBook(String bookId) {
		mybatis.delete("book.deleteBook",bookId);
	}
}
