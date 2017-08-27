package com.yasin.DesignPatternLearn.AdapterPatternAndFacedPattern.Adapter;

import org.junit.Test;


/**
 * 模拟客户方，现在user有两个版本，客户所要求的是使用V2版本的接口，
 * 如果你还想用V1版本的来实现，那就使用到了我们适配器了，
 * 只需要将V1的实现放在适配器，适配器的接口方法跟是跟V2一样，
 * 这样直接调用适配的方法就行了。
 * 
 * @author yasin
 *
 */
public class CustomerTest {
	
	
	@Test
	public void run(){
		
		UserV2 userV2 = new UserImplV2();
		
		System.out.println(userV2.registerAndLogin("admin", "admin"));
		
		UserV2 user = new UserAdapter(new UserImpl());
		
		System.out.println(user.registerAndLogin("admin", "admin"));
		
		
	}
	

}
