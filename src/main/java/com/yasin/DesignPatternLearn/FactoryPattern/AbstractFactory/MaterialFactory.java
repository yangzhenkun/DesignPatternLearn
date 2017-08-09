package com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory;

import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.BlueHreb;
import com.yasin.DesignPatternLearn.FactoryPattern.AbstractFactory.Material.RedHreb;

/**
 * @TODO  原料工厂接口，用于产生原料
 * 这也就是抽象工厂的意义，将工厂抽象
 * 
 * @author yasin
 *
 */
public interface MaterialFactory {

	public RedHreb getRedHreb();
	
	public BlueHreb getBlueHreb();
	
}
