package com.illuxplain.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "reply")
@Entity
public class Reply {
	
	@Id
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "reply")
	private String reply;
	
	@ManyToOne
	private Comment comment;
	
	private String createAt;
	
	
	
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	
}
