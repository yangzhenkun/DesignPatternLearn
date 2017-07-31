package com.yasin.DesignPatternLearn.ObserverPattern.JDK;

import java.util.Date;
import java.util.Observable;

import com.yasin.DesignPatternLearn.ObserverPattern.My.News;

/**
 * 
 * 第二个主题
 * 
 * @author yasin
 *
 */
public class JavaOfficeJDK extends Observable{

	
	public JavaOfficeJDK(){}
	
	public void send(){
		
		News news = new News("观察者模式-java",new Date(),"Java Blog","Yasin","这就是观察者模式");
		
		setChanged();
		notifyObservers(news);
	}
	
}
