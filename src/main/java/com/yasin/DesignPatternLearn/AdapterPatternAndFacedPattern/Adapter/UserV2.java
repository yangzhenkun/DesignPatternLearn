package com.yasin.DesignPatternLearn.AdapterPatternAndFacedPattern.Adapter;


/**
 * 用户二代接口，声明了注册并登录，登录，注册方法
 * 
 * @author yasin
 *
 */
public interface UserV2 {
	
	public boolean registerAndLogin(String name,String pwd);
	
	public boolean login(String name,String pwd);

	public boolean register(String name,String pwd);
}
