package com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory;

import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.BlueHreb;
import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.PrimaryBlueHreb;
import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.PrimaryRedHreb;
import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.RedHreb;

/**
 * @TODO  初级原料工厂，只会产生初级原料
 * 
 * @author yasin
 *
 */
public class PrimaryMaterialFactory implements MaterialFactory {

	@Override
	public RedHreb getRedHreb() {
		return new PrimaryRedHreb();
	}

	@Override
	public BlueHreb getBlueHreb() {
		return new PrimaryBlueHreb();
	}

}
