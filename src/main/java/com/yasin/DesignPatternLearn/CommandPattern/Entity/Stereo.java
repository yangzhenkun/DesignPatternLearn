package com.yasin.DesignPatternLearn.CommandPattern.Entity;


/**
 * 音响类
 * 
 * @author yasin
 *
 */
public class Stereo {

	//音量
	public int volume=0;
	
	//名字
	public String name;
	
	public Stereo(String name){
		this.name=name;
	}
	
	public void off(){
		System.out.println(name+" turn off");
	}
	
	public void on(){
		System.out.println(name+" turn on");
	}
	
	public void setVolume(int volume){
		this.volume=volume;
		System.out.println(name+" volume set "+volume);
	}
	
}
