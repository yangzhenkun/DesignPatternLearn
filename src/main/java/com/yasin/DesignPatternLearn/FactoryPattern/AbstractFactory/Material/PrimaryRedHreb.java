package com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material;

public class PrimaryRedHreb implements RedHreb{

	@Override
	public void used() {
		System.out.println("初级红药草被使用");
	}

}
