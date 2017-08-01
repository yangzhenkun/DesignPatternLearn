package com.yasin.DesignPatternLearn.StrategyPattern.Persons;

import com.yasin.DesignPatternLearn.StrategyPattern.Person;


/**
 * 定义一个法师，他的攻击的方式是魔法火球攻击
 * 
 * @author yasin
 *
 */
public class Mage extends Person{

	@Override
	public void show() {
		System.out.println("我是魔法师");
	}

	
}
