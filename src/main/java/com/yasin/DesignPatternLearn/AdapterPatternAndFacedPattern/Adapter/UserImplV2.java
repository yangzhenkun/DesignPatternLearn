package com.yasin.DesignPatternLearn.AdapterPatternAndFacedPattern.Adapter;

/**
 * 用户二代接口实现类
 * 
 * @author yasin
 *
 */
public class UserImplV2 implements UserV2 {

	@Override
	public boolean registerAndLogin(String name, String pwd) {
		boolean flag = register(name, pwd);
		if(flag==true)
			flag=login(name, pwd);
		return flag;
	}

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
