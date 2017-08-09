package com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory;

import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Blue;
import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Comodity;
import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Red;

/**
 * 简单工厂模式并不算一个设计模式，但是是很常用的一种设计方式
 * 虽然这里这里只是简单的用if else进行new各种子类的判断
 * 但是如果不同的类调用这个简单工厂还是会省下很多代码量，也会让代码更加清晰
 * 
 * 例如demo中Store就是使用了这个工厂，系统中可能还会存在个人仓库等多处场景,这样就节省了代码量
 * 
 * @author yasin
 *
 */
public class SimpleFactory {

	public Comodity createComdity(String type) throws Exception{
		
		Comodity comodity = null;
		if(type.equals("blue")){
			comodity = new Red();
		}else if(type.equals("red")){
			comodity = new Blue();
		}else{
			throw(new Exception("不能制作该物品"));
		}
		
		return comodity;
		
	}
	
	
}
