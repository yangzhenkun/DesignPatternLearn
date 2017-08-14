package com.yasin.DesignPatternLearn.SingletonPattern;


/**
 * 这个写法也是线程安全的，因为new会在这个类加载阶段就会被实例化，这种被称为懒汉式加载。
 * 但这种的缺点是 如果这个单例很耗资源，使用懒加载过早的创建，会造成的资源的浪费。
 * 
 * 
 * @author yasin
 *
 */
public class SingletonLazyInit {
	
	private static SingletonLazyInit instance = new SingletonLazyInit();
	
	private SingletonLazyInit(){}
	
	public static SingletonLazyInit getInstance(){
		return instance;
	}
	

}
