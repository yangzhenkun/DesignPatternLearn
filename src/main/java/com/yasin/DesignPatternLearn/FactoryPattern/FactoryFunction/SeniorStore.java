package com.yasin.DesignPatternLearn.FactoryPattern.FactoryFunction;

import com.yasin.DesignPatternLearn.FactoryPattern.FactoryFunction.Comodity.SeniorBlue;
import com.yasin.DesignPatternLearn.FactoryPattern.FactoryFunction.Comodity.SeniorRed;
import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Comodity;

public class SeniorStore extends Store {

	@Override
	protected Comodity createComodity(String type) {
		
		Comodity comodity = null;
		if(type.equals("blue")){
			comodity = new SeniorBlue();
		}else if(type.equals("red")){
			comodity = new SeniorRed();
		}
		
		return comodity;
		
	}

}
