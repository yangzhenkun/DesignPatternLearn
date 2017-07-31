package com.yasin.DesignPatternLearn.StrategyPattern;


/**
 * 策略模式
 * 定义了方法族（这族方法有统一的方法，实际就是实现了同一个接口），
 * 分别封装起来，让他们之间互相替换，
 * 从模式让 某一功能的实现 的变化独立于使用的类
 * 
 * @author yasin
 *
 * 定义一个抽象类Person，该抽象类中有基本的对象与方法
 *
 */
public abstract class Person {

	private Attack attack;//攻击
	
	public void show(){};//自我介绍
	
	//将攻击接口进行设置
	public void setAtract(Attack attack){
		this.attack=attack;
	}
	//执行攻击方法
	public void attack(){
		attack.attack();
	}
	
}
