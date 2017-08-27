package com.yasin.DesignPatternLearn.AdapterPatternAndFacedPattern.Adapter;


/**
 * 用户初始版本接口，声明了登录，注册功能
 * 
 * @author yasin
 *
 */
public interface User {
	
	public boolean login(String name,String pwd);
	
	public boolean register(String name,String pwd);
	

}
