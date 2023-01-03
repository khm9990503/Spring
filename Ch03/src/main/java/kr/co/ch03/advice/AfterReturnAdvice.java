package kr.co.ch03.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturnAdvice {

	@Pointcut("execution(* kr.co.ch03.AOPService.insert*(..))") // 정규표현식 (..) -> 모든 매개변수 허용,  * kr -> 모든 반환값 허용
	public void insertPointcut() {}
	
	@AfterReturning("insertPointcut()")
	public void afterReturn1() {
		System.out.println("횡단관심 - afterReturn1...");
	}
	public void afterReturn2() {
		System.out.println("횡단관심 - afterReturn2...");
	}
	public void afterReturn3() {
		System.out.println("횡단관심 - afterReturn3...");
	}
}
