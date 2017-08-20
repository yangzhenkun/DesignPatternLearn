package com.yasin.DesignPatternLearn.CommandPattern.Command;

import com.yasin.DesignPatternLearn.CommandPattern.Entity.Light;

/**
 * @TODO  开灯命令
 * 
 * @author yasin
 *
 */
public class LightOnCommand implements Command {

	private Light light;
	
	public LightOnCommand(Light light){
		this.light=light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
