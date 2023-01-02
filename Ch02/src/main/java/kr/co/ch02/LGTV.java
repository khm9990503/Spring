package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ltv")
public class LGTV implements TV{

	@Autowired
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("LGTV powerOn...");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LGTV powerOff...");
		
	}
	
	@Override
	public void chUp() {
		System.out.println("LGTV chUp...");
		
	}
	@Override
	public void chDown() {
		System.out.println("LGTV chDown...");
		
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
