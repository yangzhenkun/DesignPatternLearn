package com.yasin.DesignPatternLearn.StrategyPattern.Attacks;

import com.yasin.DesignPatternLearn.StrategyPattern.Attack;


/**
 * 
 * 定义了 砍 的攻击方式
 * 
 * @author yasin
 *
 */
public class Cut implements Attack{

	@Override
	public void attack() {
		System.out.println("发出砍杀攻击，造成400点物理伤害");
	}

}
