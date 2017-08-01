package com.yasin.DesignPatternLearn.ObserverPattern.JDK.Person;

import java.util.Observable;
import java.util.Observer;

import com.yasin.DesignPatternLearn.ObserverPattern.JDK.JavaOfficeJDK;
import com.yasin.DesignPatternLearn.ObserverPattern.JDK.NewsOfficeJDK;
import com.yasin.DesignPatternLearn.ObserverPattern.My.News;

public class AliceJDK implements Observer {

	Observable observable;
	
	public AliceJDK(Observable o){
		this.observable=o;
		observable.addObserver(this);
	}
	
	
	@Override
	public void update(Observable topic, Object content) {
		
		if(topic instanceof NewsOfficeJDK){
			System.out.println("alice received a news about "+ ((News)content).getTitle()+" from "+((NewsOfficeJDK)topic).getName());
		}else if(topic instanceof JavaOfficeJDK){
			System.out.println("alice received a news about "+ ((News)content).getTitle()+" from Java ");
		}
		
	}
	

}
