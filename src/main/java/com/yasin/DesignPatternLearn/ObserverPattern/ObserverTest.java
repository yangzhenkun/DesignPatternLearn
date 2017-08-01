package com.yasin.DesignPatternLearn.ObserverPattern;

import org.junit.Test;

import com.yasin.DesignPatternLearn.ObserverPattern.JDK.JavaOfficeJDK;
import com.yasin.DesignPatternLearn.ObserverPattern.JDK.NewsOfficeJDK;
import com.yasin.DesignPatternLearn.ObserverPattern.JDK.Person.AliceJDK;
import com.yasin.DesignPatternLearn.ObserverPattern.JDK.Person.BobJDK;
import com.yasin.DesignPatternLearn.ObserverPattern.JDK.Person.CimyJDK;
import com.yasin.DesignPatternLearn.ObserverPattern.My.NewsOffice;
import com.yasin.DesignPatternLearn.ObserverPattern.My.Person.Alice;
import com.yasin.DesignPatternLearn.ObserverPattern.My.Person.Bob;
import com.yasin.DesignPatternLearn.ObserverPattern.My.Person.Cimy;

public class ObserverTest {

	
	/**
	 * 测试自己实现的观察者模式
	 */
	@Test
	public void testMy(){
		
		NewsOffice newsOffice = new NewsOffice();
		Alice alice = new Alice();
		Bob bob = new Bob();
		Cimy cimy = new Cimy();
		
		newsOffice.registerObserver(alice);
		newsOffice.registerObserver(bob);
		newsOffice.registerObserver(cimy);
		
		newsOffice.sendNews();
		
		//alice不在订阅
		newsOffice.removeObserver(alice);
		newsOffice.sendNews();

		
	}
	
	
	/**
	 * 测试使用java内置实现的观察者模式
	 */
	@Test
	public void testJDK(){
		
//		NewsOfficeJDK newsOffice = new NewsOfficeJDK();
//		AliceJDK alice = new AliceJDK(newsOffice);
//		BobJDK bob = new BobJDK(newsOffice);
//		CimyJDK cimy = new CimyJDK(newsOffice);
//		
//		newsOffice.sendNews();
		
		JavaOfficeJDK java = new JavaOfficeJDK();
		AliceJDK a = new AliceJDK(java);
		java.send();
		
		
		
		
	}
	
}
