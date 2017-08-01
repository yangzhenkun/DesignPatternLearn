package com.yasin.DesignPatternLearn.StrategyPattern.Attacks;

import com.yasin.DesignPatternLearn.StrategyPattern.Attack;


/**
 * 
 * 定义一个魔法火球攻击方式
 * 
 * @author yasin
 *
 */
public class Fireball implements Attack{

	@Override
	public void attack() {
		System.out.println("发出魔法火球，造成500点魔法伤害");
	}

}
