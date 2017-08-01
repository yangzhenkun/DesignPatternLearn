package com.yasin.DesignPatternLearn.DecoratorPattern;


/**
 * 
 * 该游戏世界的基础单位，一切角色物品都是该抽象类的子类
 * 
 * @author yasin
 *
 */
public abstract class Unit {
	
	public String description="未知人物";
	
	public String getDescription(){
		return description;
	}
	
	//自身能力值
	public abstract int power();

}
