package com.yasin.DesignPatternLearn.AdapterPatternAndFacedPattern.Adapter;

/**
 * 一代用户接口实现类
 * 
 * @author yasin
 *
 */
public class UserImpl implements User {

	@Override
	public boolean login(String name, String pwd) {
		if(name.equals("admin")&&pwd.equals("admin"))
			return true;
		return false;
	}

	@Override
	public boolean register(String name, String pwd) {
		if(name.equals("admin")&&pwd.equals("admin"))
			return true;
		
		return false;
	}

}
