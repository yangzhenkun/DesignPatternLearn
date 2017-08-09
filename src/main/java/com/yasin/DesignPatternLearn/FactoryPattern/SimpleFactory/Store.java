package com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory;

import com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity.Comodity;

/**
 * 商店
 * 
 * @author yasin
 *
 */
public class Store {

	SimpleFactory factory ;
	
	public Store(SimpleFactory factory){
		this.factory=factory;
	}
	
	
	/**
	 * @TODO 获得一个做好的商品
	 * 
	 * @param type 商品类型
	 * @return
	 * @throws Exception
	 */
	public Comodity getComodity(String type) throws Exception{
		Comodity comodity ;
		comodity = factory.createComdity(type);
		
		comodity.make();//制造这个商品
		
		return comodity;
	}
	
	
}
