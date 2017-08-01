package com.yasin.DesignPatternLearn.ObserverPattern.My.Person;

import com.yasin.DesignPatternLearn.ObserverPattern.My.News;
import com.yasin.DesignPatternLearn.ObserverPattern.My.Observer;

public class Bob implements Observer{

	@Override
	public void receiverNews(News news) {
		System.out.println("Bob received a news about "+news.getTitle());
	}

}
