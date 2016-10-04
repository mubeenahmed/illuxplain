package com.illuxplain.models;

public class Comments {
	
	private String commentText;
	private String nameOfCommentor;
	private long created;
	private String pageID;
	
	
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
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public String getPageID() {
		return pageID;
	}
	public void setPageID(String pageID) {
		this.pageID = pageID;
	}
	
	
	
	
}
