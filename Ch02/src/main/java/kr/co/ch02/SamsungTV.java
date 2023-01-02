package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stv")
public class SamsungTV implements TV{
	@Autowired
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn...");
		
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOff...");
		
	}
	
	@Override
	public void chUp() {
		System.out.println("SamsungTV chUp...");
		
	}
	@Override
	public void chDown() {
		System.out.println("SamsungTV chDown...");
		
	}
	
	@Override
	public void soundDown() {
		speaker.soundDown();
		
	}
	@Override
	public void soundUp() {
		speaker.soundUp();
		
	}
}
