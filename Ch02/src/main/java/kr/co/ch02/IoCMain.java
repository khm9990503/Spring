package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 
 * 날짜 : 2023/01/02
 * 이름 : 구홍모
 * 내용 : 스프링 IoC 실습하기
 * 
 *  IoC(Inversion of Control)
 *  - 자바 객체를 생성하고 객체 사이의 의존관계를 스프링 컨테이너로 처리하는 개념
 *  - DI(dependency annotation)는 IoC 구현하는 기술 (DL은 더 이상 안 사용)
 *  - 일반적으로 DI 기법 중 Annotation 방식을 사용
 * 
 */
public class IoCMain {

	public static void main(String[] args) {
		/*
		// IoC를 활용 안하는 객체 생성
		TV t1 = new LGTV();
		TV t2 = new SamsungTV();
		
		t1.powerOn();
		t1.chUp();
		//t1.soundUp(); -- this.speaker null error
		
		t2.powerOn();
		t2.chUp();
		//t2.soundUp(); -- this.speaker null error
		*/
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		TV ltv = (TV) ctx.getBean("ltv");
		TV stv = (TV) ctx.getBean("stv");
		
		ltv.powerOn();
		ltv.chDown();
		ltv.soundDown();
		stv.powerOn();
		stv.chDown();
		stv.soundDown();
	}
	
}
