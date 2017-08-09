package com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory;

import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.BlueHreb;
import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.RedHreb;
import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.SeniorBlueHreb;
import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.SeniorRedHreb;


/**
 * @TODO  高级原料工厂
 * 
 * @author yasin
 *
 */
public class SeniorMaterialFactory implements MaterialFactory {

	@Override
	public RedHreb getRedHreb() {
		return new SeniorRedHreb();
	}

	@Override
	public BlueHreb getBlueHreb() {
		return new SeniorBlueHreb();
	}

}
