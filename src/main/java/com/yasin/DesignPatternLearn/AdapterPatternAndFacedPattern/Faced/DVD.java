package com.yasin.DesignPatternLearn.AdapterPatternAndFacedPattern.Faced;


/**
 * DVD
 * 
 * @author yasin
 *
 */
public class DVD {

	public void on(){
		System.out.println("打开DVD");
	}
	
	public void off(){
		System.out.println("关闭DVD");
	}
	
	public void placeCD(){
		System.out.println("放置碟片");
	}
	
	public void removeCD(){
		System.out.println("取出碟片");
	}
	
}
