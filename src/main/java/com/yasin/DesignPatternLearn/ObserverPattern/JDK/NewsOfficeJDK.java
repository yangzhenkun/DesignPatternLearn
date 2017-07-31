package com.yasin.DesignPatternLearn.ObserverPattern.JDK;

import java.util.Date;
import java.util.Observable;

import com.yasin.DesignPatternLearn.ObserverPattern.My.News;

/**
 * 
 * 利用jav内置实现的Observable类来实现一个主题发布者（被观察者）
 * 
 * @author yasin
 *
 */
public class NewsOfficeJDK extends Observable{
	
	public NewsOfficeJDK(){}
	
	public void sendNews(){
		
		News news = new News("观察者模式",new Date(),"Yasin Blog","Yasin","这就是观察者模式");
		setChanged();
		notifyObservers(news);
		
	}
	
	
	/*
	 *  用于描述该发布者的信息
	 */
	public String getName(){
		return "我是Yasin报社";
	}
	
	
}
