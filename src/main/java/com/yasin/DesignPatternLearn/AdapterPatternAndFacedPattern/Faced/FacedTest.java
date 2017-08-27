package com.yasin.DesignPatternLearn.AdapterPatternAndFacedPattern.Faced;

import org.junit.Test;

public class FacedTest {
	
	@Test
	public void run(){
		
		DVD dvd = new DVD();
		Light light = new Light();
		Projector pro = new Projector();
		
		Faced faced = new Faced(dvd, light, pro);
		
		faced.watchVideo();
		
	}

}
