package com.yasin.DesignPatternLearn.AdapterPatternAndFacedPattern.Adapter;

/**
 * 适配器
 * 
 * @author yasin
 *
 */
public class UserAdapter implements UserV2 {

	private User user;
	
	public UserAdapter(User user){
		this.user=user;
	}
	
	@Override
	public boolean registerAndLogin(String name, String pwd) {
		boolean flag = user.register(name, pwd);
		if(flag==true)
			flag=user.login(name, pwd);
		return flag;
	}

	@Override
	public boolean login(String name, String pwd) {
		return user.login(name, pwd);
	}

	@Override
	public boolean register(String name, String pwd) {
		return user.register(name, pwd);
	}

}
