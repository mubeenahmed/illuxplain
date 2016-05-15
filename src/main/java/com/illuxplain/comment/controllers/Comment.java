package com.illuxplain.comment.controllers;

import java.util.Date;

public class Comment {
	
	private String name;
	private String comment;
	private long date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public long getDate() {
		Date date = new Date();
		return date.getTime();
	}
	public void setDate(long date) {
		this.date = date;
	}
	
	
	
	
}
