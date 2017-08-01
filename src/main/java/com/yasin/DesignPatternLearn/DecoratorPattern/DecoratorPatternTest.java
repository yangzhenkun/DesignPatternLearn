package com.yasin.DesignPatternLearn.DecoratorPattern;

import org.junit.Test;

import com.yasin.DesignPatternLearn.DecoratorPattern.Arms.Axe;
import com.yasin.DesignPatternLearn.DecoratorPattern.Arms.Staff;
import com.yasin.DesignPatternLearn.DecoratorPattern.Person.Mage;
import com.yasin.DesignPatternLearn.DecoratorPattern.Person.Minister;

/**
 * 这是装饰者的demo，但我认为我这个demo场景使用装饰着模式并不是很合适，
 * 之所有使用游戏场景，是希望这个模式更加容易理解
 * 完美诠释装饰者模式莫过于java io相关类，使用的非常合适，在读者能通过我这个简单的例子了解到
 * 装饰着模式大概是怎么设计的，在去了解java io的设计会更容易。
 * 
 * 
 * @author yasin
 *
 */
public class DecoratorPatternTest {

	
	@Test
	public void run(){
		
		Unit mage = new Mage();//创建了一个法师
		mage = new Axe(mage);//装备了斧子
		mage = new Staff(mage);//装备法杖
		
		System.out.println(mage.getDescription()+"  能力值:"+mage.power());
		
		Unit minister = new Minister();
		minister = new Staff(minister);
		
		System.out.println(minister.getDescription()+" 能力值: "+minister.power());
		
		
	}
	
}
