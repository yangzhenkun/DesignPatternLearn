package com.yasin.DesignPatternLearn.TemplatePattern;

/**
 * 银行卡支付
 * @author yasin
 *
 */
public class CardPay extends Trade {

	/**
	 * 其实这里也是一个模板方法
	 * 1.获取支付账号
	 * 2.扣除该账号金额
	 * 3.为对方加入对应金额
	 * 
	 * 这里就省略了，默认实现是支付成功，返回了true
	 */
	@Override
	public boolean pay() {
		
		System.out.println("使用 银行卡 支付了金额");
		
		//省略所有的支付环节
		
		return true;
		
	}

}
