package kr.co.ch03.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdvice {
	
	@Pointcut("execution(* kr.co.ch03.AOPService.insert*(..))") // 정규표현식 (..) -> 모든 매개변수 허용,  * kr -> 모든 반환값 허용
	public void insertPointcut() {}
	@Pointcut("execution(* kr.co.ch03.AOPService.select*(..))") 
	public void selectPointcut() {}
	@Pointcut("execution(* kr.co.ch03.AOPService.update*(..))") 
	public void updatePointcut() {}

	@Before("insertPointcut()")
	public void before1() {
		System.out.println("횡단관심 - before1...");
	}
	@Before("selectPointcut()")
	public void before2() {
		System.out.println("횡단관심 - before2...");
	}
	@Before("updatePointcut()")
	public void before3() {
		System.out.println("횡단관심 - before3...");
	}
}
