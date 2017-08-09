package com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity;


/**
 * 红药
 * 需要3住药草制作
 * 能回复500血量
 * 
 * @author yasin
 *
 */
public class Red extends Comodity {

	@Override
	public void make() {
		System.out.println("需要3株药草可以制作红药");
	}

	@Override
	public void use() {
		System.out.println("使用者回复500血量");
	}

	
	
	
}
