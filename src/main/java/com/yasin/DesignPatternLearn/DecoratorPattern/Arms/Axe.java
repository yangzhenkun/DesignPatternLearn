package com.yasin.DesignPatternLearn.DecoratorPattern.Arms;

import com.yasin.DesignPatternLearn.DecoratorPattern.Unit;

/**
 * 斧子
 * 能力值- 100
 * 装备该斧子能力值增加100
 * 
 * 
 * @author yasin
 *
 */
public class Axe extends Arms {

	Unit unit;
	
	public Axe(Unit unit){
		this.unit=unit;
	}
	
	@Override
	public String getDescription() {
		return unit.getDescription()+" 装备了斧子 ";
	}

	/**
	 * 该世界中人物unit装备（添加）了该斧子，能力就增加100
	 */
	@Override
	public int power() {
		return unit.power()+100;
	}

}
