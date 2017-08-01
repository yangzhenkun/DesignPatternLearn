package com.yasin.DesignPatternLearn.ObserverPattern.My;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 定义一个报社，也就是主题（被订阅者）
 * 
 * 
 * @author yasin
 *
 */
public class NewsOffice implements Subject{

	//用来保存所有的观察者
	private List<Observer> observers;
	
	public NewsOffice(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	
	/**
	 * 通知所有注册该主题的观察者
	 */
	@Override
	public void notifyObservers(News news) {
		for(Observer o:observers){
			o.receiverNews(news);
		}
		
	}
	
	public void sendNews(){
		News news = new News("观察者模式",new Date(),"Yasin Blog","Yasin","这就是观察者模式");
		notifyObservers(news);
	}
	

}
