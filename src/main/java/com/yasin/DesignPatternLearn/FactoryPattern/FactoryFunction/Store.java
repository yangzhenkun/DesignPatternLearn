package com.yasin.DesignPatternLearn.FactoryPattern.FactoryFunction;

import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Comodity;

/**
 * 当系统中很多店铺时并且不同店铺制作的同一种商品也有不同的地方
 * 将Comodity方法抽象，由其子类实现
 * 所以将Comodity的具体创建交给Store的子类
 * 
 * 
 * @author yasin
 *
 */
public abstract class Store {
	
	
	public Comodity getComodity(String type) throws Exception{
		Comodity comodity ;
		comodity = createComodity(type);
		
		comodity.make();//制造这个商品
		
		return comodity;
	}
	
	/**
	 * @TODO  一个抽象方法，具体商品的制作过程需要其子类实现
	 * @param type
	 * @return
	 */
	protected abstract Comodity createComodity(String type);
	
}
