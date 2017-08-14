package com.yasin.DesignPatternLearn.SingletonPattern;


/**
 * 这种线程安全也是由jvm保证的
 * 这里使用静态内部类正好解决了懒加载问题，等到调用{@link #getInstance()方法，才会加载内部类SingleHolder}
 * 
 * 这也是我推荐的的方法
 * 
 * 
 * @author yasin
 *
 */
public class SingletonStatic {
	
	private static class SingleHolder{
		private static final SingletonStatic instance = new SingletonStatic();
	}
	
	private SingletonStatic(){}
	
	public static SingletonStatic getInstance(){
		return SingleHolder.instance;
	}

}
