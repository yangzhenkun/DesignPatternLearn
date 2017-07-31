package com.yasin.DesignPatternLearn.ObserverPattern.My.Person;

import com.yasin.DesignPatternLearn.ObserverPattern.My.News;
import com.yasin.DesignPatternLearn.ObserverPattern.My.Observer;

public class Alice implements Observer{

	@Override
	public void receiverNews(News news) {
		System.out.println("Alice received a news about "+news.getTitle());
	}

}
