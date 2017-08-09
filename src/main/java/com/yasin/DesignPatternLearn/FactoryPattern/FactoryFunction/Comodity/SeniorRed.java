package com.yasin.DesignPatternLearn.FactoryPattern.FactoryFunction.Comodity;

import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Comodity;

public class SeniorRed extends Comodity {

	@Override
	public void make() {
		System.out.println("需要1株高级药草");
	}

	@Override
	public void use() {
		System.out.println("恢复500血量");
	}
	

}
