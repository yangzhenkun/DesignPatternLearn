package com.yasin.DesignPatternLearn.TemplatePattern;


/**
 * 模板基类
 * 
 * @author yasin
 *
 */
public abstract class Trade {
	
	/**
	 * 交易模板方法
	 * 1.冻结该票
	 * 2.进行支付
	 * 3.支付成功->出票
	 * 4.解冻
	 * 
	 * @author yasin
	 * @param name
	 */
	public void order(String name){
		
		frozen(name);
		if(pay()){
			deliver(name);
		}
		unfrozen(name);
		
	}
	
	/**
	 * 冻结该票
	 * 
	 * @author yasin
	 * @param name
	 */
	private  void frozen(String name){
		System.out.println(name+" 已经被冻结");
	}
	
	/**
	 * 支付,抽象方法，交由具体的实体类实现
	 * @author yasin
	 * @return
	 */
	protected abstract boolean pay();
	
	/**
	 * 解冻
	 * 
	 * @author yasin
	 * @param name
	 */
	private void unfrozen(String name){
		System.out.println(name+" 已经被解冻");
	}
	
	/**
	 * 出票
	 * @author yasin
	 * @param name
	 */
	private void deliver(String name){
		System.out.println(name +" 已经出票");
	} 

}
