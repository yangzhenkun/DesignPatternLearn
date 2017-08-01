package com.yasin.DesignPatternLearn.StrategyPattern;

import org.junit.Test;

import com.yasin.DesignPatternLearn.StrategyPattern.Attacks.Cut;
import com.yasin.DesignPatternLearn.StrategyPattern.Attacks.Fireball;
import com.yasin.DesignPatternLearn.StrategyPattern.Persons.Mage;
import com.yasin.DesignPatternLearn.StrategyPattern.Persons.Warrior;

public class StrategyPatterntTest {

	@Test
	public void run(){
		
		Mage mage = new Mage();
		mage.show();
		mage.setAtract(new Fireball());
		mage.attack();
		mage.setAtract(new Cut());
		mage.attack();
		
		Warrior warrior = new Warrior();
		warrior.show();
		warrior.setAtract(new Cut());
		warrior.attack();
		
	}
	
	
}
