package com.yasin.DesignPatternLearn.CommandPattern.Command;

/**
 * 所有的命令类都实现这个接口，同时由于client（遥控器）和receiver（电器）之间操作解耦的关键，
 * 命令模式的中心思想就是将将操作（命令）通过该接口的子类对象进行传递
 * 
 * @author yasin
 *
 */
public interface Command {
	
	/**
	 * 将说有的命令封装该方法中
	 * @author yasin
	 */
	public void execute();

}
