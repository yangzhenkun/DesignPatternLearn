package com.yasin.DesignPatternLearn.CommandPattern.Command;

import com.yasin.DesignPatternLearn.CommandPattern.Entity.Light;

/**
 * @TODO 关灯命令
 * 
 * @author yasin
 *
 */
public class LightOffCommand implements Command {

	private Light light ;
	
	public LightOffCommand(Light light){
		this.light=light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

}
