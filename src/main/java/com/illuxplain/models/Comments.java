package com.illuxplain.models;

import java.util.List;

public class Comments {
	
	private String commentText;
	private String nameOfCommentor;
	private long created;
	private String pageID;
	private long comment_id;
	private List<Reply>	replies;
	
	
	public List<Reply> getReplies() {
		return replies;
	}
	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}
	public long getComment_id() {
		return comment_id;
	}
	public void setComment_id(long comment_id) {
		this.comment_id = comment_id;
	}
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
