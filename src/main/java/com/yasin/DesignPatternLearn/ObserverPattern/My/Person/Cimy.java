package com.yasin.DesignPatternLearn.ObserverPattern.My.Person;

import com.yasin.DesignPatternLearn.ObserverPattern.My.News;
import com.yasin.DesignPatternLearn.ObserverPattern.My.Observer;

public class Cimy implements Observer{

	@Override
	public void receiverNews(News news) {
		System.out.println("Cimy received a news about "+news.getTitle());
	}

}
