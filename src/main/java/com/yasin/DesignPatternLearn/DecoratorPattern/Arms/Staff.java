package com.yasin.DesignPatternLearn.DecoratorPattern.Arms;

import com.yasin.DesignPatternLearn.DecoratorPattern.Unit;

/**
 * 法杖
 * 能力值-120
 * 装备法杖，能力值增加120
 * 
 * @author yasin
 *
 */
public class Staff extends Arms{

	Unit unit;
	
	public Staff(Unit unit){
		this.unit=unit;
	}
	
	
	@Override
	public String getDescription() {
		return unit.getDescription()+" 装备了法杖 ";
	}

	@Override
	public int power() {
		return unit.power()+120;
	}

}
