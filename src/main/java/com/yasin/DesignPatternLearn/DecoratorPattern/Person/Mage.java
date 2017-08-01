package com.yasin.DesignPatternLearn.DecoratorPattern.Person;

import com.yasin.DesignPatternLearn.DecoratorPattern.Unit;


/**
 * 
 * 基础人物-魔法师
 * 能力值 100（魔法师是主要的输出，能力值自然高）
 * 
 * @author yasin
 *
 */
public class Mage extends Unit {

	public Mage(){
		description="我是魔法师";
	}
	
	@Override
	public int power() {
		return 100;
	}

}
