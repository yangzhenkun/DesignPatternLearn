package com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Comodity;

import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.MaterialFactory;

public class Blue extends Comodity {

	MaterialFactory materialFactory;

	public Blue(MaterialFactory materialFacotry){
		this.materialFactory=materialFacotry;
	}

	@Override
	public void make() {
		materialFactory.getBlueHreb().used();
	}
}
