package com.yasin.DesignPatternLearn.ObserverPattern.My;


/**
 * 主题接口，所有的主题实现类都要实现该接口
 * @author yasin
 *
 */
public interface Subject {

	//观察者注册
	public void registerObserver(Observer o);
	
	//移除已注册的观察者
	public void removeObserver(Observer o);
	
	//通知所有已经注册该主题的观察者
	public void notifyObservers(News news);
	
}
