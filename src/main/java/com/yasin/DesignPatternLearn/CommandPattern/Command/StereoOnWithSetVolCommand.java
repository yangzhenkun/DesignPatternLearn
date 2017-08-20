package com.yasin.DesignPatternLearn.CommandPattern.Command;

import com.yasin.DesignPatternLearn.CommandPattern.Entity.Stereo;

public class StereoOnWithSetVolCommand implements Command{

	private Stereo stereo;
	
	public  StereoOnWithSetVolCommand(Stereo stereo) {
		this.stereo=stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setVolume(11);
	}

}
