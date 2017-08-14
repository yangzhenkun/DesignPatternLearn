package com.yasin.DesignPatternLearn.SingletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;


/**
 * @TODO  线程不安全测试代码
 * 
 * @author yaisn
 *
 */
public class SingletonUnsafeTest {

	
	@Test
	public void run(){
		
		ExecutorService pool = Executors.newFixedThreadPool(30);
		
		for(int i=0;i<30;i++){
			pool.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(SingletonUnsafe.getInstance());
				}
			});
			
			
		}
		
		
	}
	
	
}
