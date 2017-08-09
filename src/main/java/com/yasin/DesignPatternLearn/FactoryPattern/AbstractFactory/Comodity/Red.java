package com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Comodity;

import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.MaterialFactory;

public class Red extends Comodity {

	MaterialFactory materialFactory;
	
	public Red(MaterialFactory materialFacotry){
		this.materialFactory=materialFacotry;
	}

	@Override
	public void make() {
		materialFactory.getRedHreb().used();
	}

	
	
	
}