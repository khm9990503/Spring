package kr.co.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com")
public class Computer {

	// 1.생성자 DI
	private CPU cpu; 
	@Autowired
	public Computer(CPU cpu) { // 스프링에서는 이 방법을 권장
		this.cpu = cpu;
	}
	
	// 2.새터 DI
	private RAM ram;
	@Autowired
	public void setRam(RAM ram) { // set
		this.ram = ram;
	}
	
	// 3.필드 DI
	@Autowired
	private HDD hdd; // 초기화 생성자가 없으므로 실행 불가 그러므로 DI(@Autowired) 한다. Field Injection 방법(간단하고 많이 사용)
	
	public void show() {
		cpu.show();
		ram.show();
		hdd.show();
	}
}
