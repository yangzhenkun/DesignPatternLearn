package com.yasin.DesignPatternLearn.CommandPattern;

import org.junit.Test;

import com.yasin.DesignPatternLearn.CommandPattern.Command.Command;
import com.yasin.DesignPatternLearn.CommandPattern.Command.LightOffCommand;
import com.yasin.DesignPatternLearn.CommandPattern.Command.LightOnCommand;
import com.yasin.DesignPatternLearn.CommandPattern.Command.StereoOffCommand;
import com.yasin.DesignPatternLearn.CommandPattern.Command.StereoOnCommand;
import com.yasin.DesignPatternLearn.CommandPattern.Command.StereoOnWithSetVolCommand;
import com.yasin.DesignPatternLearn.CommandPattern.Entity.Light;
import com.yasin.DesignPatternLearn.CommandPattern.Entity.Stereo;


/**
 * @TODO 命令与执行端的组装
 * 
 * @author yasin
 *
 */
public class Client {

	
	@Test
	public void run(){
		RemoteController remote = new RemoteController();
		Light light =new  Light("客厅灯");
		Stereo stereo = new Stereo("音响");
		
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);
		
		Command stereoOn = new StereoOnWithSetVolCommand(stereo);
		Command stereoOff = new StereoOffCommand(stereo);
	
		remote.setCommand(lightOn, lightOff);
		
		remote.onButton();
		remote.offButton();
		
		remote.setCommand(stereoOn, stereoOff);
		remote.onButton();
		remote.offButton();
		
		
		
		
		
	}
	
	
}
