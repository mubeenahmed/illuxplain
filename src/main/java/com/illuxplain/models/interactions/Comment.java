package com.illuxplain.models.interactions;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {
	
	@Id
	private Long id;
	
	@Column(name = "comment_text")
	private String commentText;
	
	@Column(name = "name_of_commentor")
	private String nameOfCommentor;
	
	@Column(name = "created")
	private long created;
	
	@Column(name = "page_id")
	private String pageID;

	@OneToMany
	@JoinColumn(name = "replies_id")
	private List<Reply>	replies;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public List<Reply> getReplies() {
		return replies;
	}


	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}
	
	
}
