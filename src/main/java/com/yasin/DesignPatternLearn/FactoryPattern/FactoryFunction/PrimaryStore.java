package com.yasin.DesignPatternLearn.FactoryPattern.FactoryFunction;

import com.yasin.DesignPatternLearn.FactoryPattern.FactoryFunction.Comodity.PrimaryBlue;
import com.yasin.DesignPatternLearn.FactoryPattern.FactoryFunction.Comodity.PrimaryRed;
import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Blue;
import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Comodity;
import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Red;

/**
 * 初级店铺
 * 
 * 
 * @author yasin
 *
 */
public class PrimaryStore extends Store{

	
	@Override
	protected Comodity createComodity(String type) {
		
		Comodity comodity = null;
		if(type.equals("blue")){
			comodity = new PrimaryBlue();
		}else if(type.equals("red")){
			comodity = new PrimaryRed();
		}
		
		return comodity;
		
	}

}
