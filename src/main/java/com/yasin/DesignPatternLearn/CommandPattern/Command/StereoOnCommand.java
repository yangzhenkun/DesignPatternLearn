package com.yasin.DesignPatternLearn.CommandPattern.Command;

import com.yasin.DesignPatternLearn.CommandPattern.Entity.Stereo;

public class StereoOnCommand implements Command {

	private Stereo stereo;
	
	public StereoOnCommand(Stereo stereo){
		this.stereo=stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
	}

}
