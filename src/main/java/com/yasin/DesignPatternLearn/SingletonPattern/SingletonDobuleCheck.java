package com.yasin.DesignPatternLearn.SingletonPattern;


/**
 * 这是采用两次检查并使用volatile修饰保证其线程安全
 * 
 * 首先没有在{@link SingletonDobuleCheck#getInstance()}这个地方添加一个synchronized修饰
 * 是因为该方法也只有在创建的时候需要加锁保证线程安全，在接下来的普通获取中并不需要加锁，如果直接对这个方法
 * 进行加锁，会造成多余的性能损耗。
 * 所以只在new操作环节对其加锁即可。
 * 
 * 但是这样使用了volatile和synchronized关键字，在java5之前并不适用
 * 
 * @author yasin
 *
 */
public class SingletonDobuleCheck {
	
	private volatile static SingletonDobuleCheck instance;
	
	private SingletonDobuleCheck(){}
	
	
	public static SingletonDobuleCheck getInstance(){
		
		if(instance==null){
			
			synchronized(SingletonDobuleCheck.class){
				if(instance==null){//再次检查
					instance=new SingletonDobuleCheck();
				}
			}
			
		}
		
		return instance;
	}
	

}
