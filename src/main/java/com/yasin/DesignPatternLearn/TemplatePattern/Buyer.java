package com.yasin.DesignPatternLearn.TemplatePattern;

import org.junit.Test;


/**
 * 一个买家
 * @author yasin
 *
 */
public class Buyer {
	
	
	@Test
	public void main(){
		//车票路段
		String name = "北京到济宁";
		//使用支付宝进行交易
//		Trade pay = new ZhiFuBaoPay();
//		pay.order(name);

		//使用银行卡进行交易
		Trade cardPay = new CardPay();
		cardPay.order(name);
	}
	
	
	
	

}
