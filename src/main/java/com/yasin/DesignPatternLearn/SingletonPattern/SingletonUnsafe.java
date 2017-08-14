package com.yasin.DesignPatternLearn.SingletonPattern;


/**
 * 这是一个最简单的单例代码，在单线程下是完成了单例的需求。
 * 将构造方法私有
 * 通过一个静态方法获取其实例。
 * 但是这个单例在多线并发下，可能存在创建出多个对象的情况。
 * 
 * 例如一个线程调用 {@link #getInstance()}方法，代码执行到if判断完成，
 * 但还没有对其进行new操作；这是另一个线程也调用这个方法，它也刚执行完if判断，
 * 接下来进行new操作了，执行完后。又切换到了刚才那个线程，它也进行new操作，这样
 * 这两个线程就分别new了一个实例，这样SingletonUnsafe的实例并没有实现期望的
 * 单例。
 * 
 * 运行这个测试代码 {@link SingletonUnsafeTest}，就可以发现打印对象的内存地址并不一样，这就说明并不是同一个实例，
 * 所以这个代码在多线程并发环境是不能保证其单例的。如果运行多次没有出现这种效果，还是由于代码执行快，并发不够，这样可以再new
 * 操作之前添加一些代码，减慢执行速度，这样效果显而易见
 * 
 * 
 * @author yasin
 *
 */
public class SingletonUnsafe {

	private static SingletonUnsafe instance;
	
	private SingletonUnsafe(){}
	
	public static SingletonUnsafe getInstance(){
		if(instance==null){
//			System.out.println(1);  //添加一样输出，增加判断后的运行时间，增加这段时间线程切换的概率
			instance = new SingletonUnsafe();
		}
		return instance;
	}
	
	
}
