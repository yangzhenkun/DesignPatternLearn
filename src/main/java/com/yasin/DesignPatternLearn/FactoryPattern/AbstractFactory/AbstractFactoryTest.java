package com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory;

import org.junit.Test;

import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Comodity.Blue;
import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Comodity.Red;

public class AbstractFactoryTest {

	
	@Test
	public void run(){
		
		SeniorMaterialFactory senior = new SeniorMaterialFactory();
		PrimaryMaterialFactory primary = new PrimaryMaterialFactory();
		Red red = new Red(senior);
		red.make();
		
		Blue blue = new Blue(primary);
		blue.make();
		
	}
	
	
}
