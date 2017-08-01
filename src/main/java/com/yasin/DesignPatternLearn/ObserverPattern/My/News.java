package com.yasin.DesignPatternLearn.ObserverPattern.My;

import java.util.Date;

/**
 * 
 * 新闻实体
 * 
 * @author yaisn
 *
 */
/**
 * @author jh
 *
 */
public class News {
	
	String title;
	Date date;
	String where;
	String autho;
	String content;
	
	
	
	public News(String title, Date date, String where, String autho, String content) {
		super();
		this.title = title;
		this.date = date;
		this.where = where;
		this.autho = autho;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getAutho() {
		return autho;
	}
	public void setAutho(String autho) {
		this.autho = autho;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
