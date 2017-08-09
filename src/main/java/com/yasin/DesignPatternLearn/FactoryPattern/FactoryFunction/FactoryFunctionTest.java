package com.yasin.DesignPatternLearn.FactoryPattern.FactoryFunction;

import org.junit.Test;

import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Comodity;

public class FactoryFunctionTest {

	@Test
	public void fun(){
		
		Store store = new SeniorStore();
		try {
			Comodity comodity = store.getComodity("blue");
			comodity.use();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
