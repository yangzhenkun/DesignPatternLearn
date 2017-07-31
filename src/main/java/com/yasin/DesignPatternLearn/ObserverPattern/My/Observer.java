package com.yasin.DesignPatternLearn.ObserverPattern.My;


/**
 * 
 * 观察者接口，所有的观察者都要实现该接口
 * 
 * @author yasin
 *
 */
public interface Observer {

	public void receiverNews(News news);
	
}
