package com.yasin.DesignPatternLearn.AdapterPatternAndFacedPattern.Faced;


/**
 * 家庭影院的外观模式类
 * 
 * @author yasin
 *
 */
public class Faced {
	
	private DVD dvd;
	private Light light;
	private Projector projector;
	
	public Faced(DVD dvd,Light light,Projector projector){
		this.dvd=dvd;
		this.light=light;
		this.projector=projector;
	}
	
	
	public void watchVideo(){
		
		projector.on();
		dvd.on();
		dvd.placeCD();
		light.off();
	}


}
