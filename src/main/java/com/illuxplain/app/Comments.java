package com.illuxplain.app;

import java.util.Date;

public class Comments {

	private String commentText;
	private String nameOfCommentor;
	private Date dateOfCreation;
	private long commentID;
	private long pageID;
	
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public String getNameOfCommentor() {
		return nameOfCommentor;
	}
	public void setNameOfCommentor(String nameOfCommentor) {
		this.nameOfCommentor = nameOfCommentor;
	}
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public long getCommentID() {
		return commentID;
	}
	public void setCommentID(long commentID) {
		this.commentID = commentID;
	}
	public long getPageID() {
		return pageID;
	}
	public void setPageID(long pageID) {
		this.pageID = pageID;
	}
	
	
	
}
