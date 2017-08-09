package com.yasin.DesignPatternLearn.FactoryPattern.SimpleFactory.Comodity;

/**
 * 蓝药
 * 
 * @author yasin
 *
 */
public class Blue extends Comodity {

	@Override
	public void make() {
		System.out.println("需要3住魔草制作");
	}

	@Override
	public void use() {
		System.out.println("回复使用者300蓝量");
	}

	
	
	
}
