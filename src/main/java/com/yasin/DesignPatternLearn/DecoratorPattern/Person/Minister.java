package com.yasin.DesignPatternLearn.DecoratorPattern.Person;

import com.yasin.DesignPatternLearn.DecoratorPattern.Unit;


/**
 * 基本人物-牧师
 * 能力值80（不是要黑牧师（奶妈））
 * 
 * @author yasin
 *
 */
public class Minister extends Unit {

	public Minister(){
		description="牧师";
	}
	
	@Override
	public int power() {
		return 80;
	}

}
