package com.yasin.DesignPatternLearn.CommandPattern.Entity;

public class Light {
	
	public String name;
	
	public Light(String name){
		this.name=name;
	}
	
	public void on(){
		System.out.println(name+" turn on");
	}
	
	public void off(){
		System.out.println(name+"turn off ");
	}

}
