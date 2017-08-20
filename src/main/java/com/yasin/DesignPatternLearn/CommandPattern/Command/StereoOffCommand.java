package com.yasin.DesignPatternLearn.CommandPattern.Command;

import com.yasin.DesignPatternLearn.CommandPattern.Entity.Stereo;

public class StereoOffCommand implements Command{

	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo=stereo;
	}
	
	@Override
	public void execute() {
		stereo.off();
	}

}
