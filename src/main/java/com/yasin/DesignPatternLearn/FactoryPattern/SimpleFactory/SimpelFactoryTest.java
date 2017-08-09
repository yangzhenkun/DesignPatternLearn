package com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory;

import org.junit.Test;

import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Comodity;

public class SimpelFactoryTest {

	
	@Test
	public void fun(){
		
		SimpleFactory factory = new SimpleFactory();
		Store store = new Store(factory);
		try {
			//从商店中获取一个红药
			Comodity red =  store.getComodity("red");
			red.make();
			red.use();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
