package com.yasin.DesignPatternLearn.CommandPattern;

import com.yasin.DesignPatternLearn.CommandPattern.Command.Command;

/**
 * @TODO 一个具有开关按钮的遥控器
 * 
 * 
 * @author yasin
 *
 */
public class RemoteController {

	private Command on;
	private Command off;
	
	//设置开关命令
	public void setCommand(Command on,Command off){
		this.on=on;
		this.off=off;
	}
	
	//点击打开按钮
	public void onButton(){
		on.execute();
	}
	
	//点击关闭按钮
	public void offButton(){
		off.execute();
	}
	
	
}
