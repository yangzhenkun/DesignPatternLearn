package com.yasin.DesignPatternLearn.ObserverPattern.JDK.Person;

import java.util.Observable;
import java.util.Observer;

import com.yasin.DesignPatternLearn.ObserverPattern.JDK.NewsOfficeJDK;
import com.yasin.DesignPatternLearn.ObserverPattern.My.News;

public class BobJDK implements Observer {

	Observable observable;

	public BobJDK(Observable o){
		this.observable=o;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable topic, Object content) {
		System.out.println("bob received a news about "+ ((News)content).getTitle()+" from "+((NewsOfficeJDK)topic).getName());
	}

}
