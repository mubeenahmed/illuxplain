package com.illuxplain.models.interactions;

import com.illuxplain.models.blog.Blog;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "comment_text")
	private String commentText;
	
	@Column(name = "name_of_commentor")
	private String nameOfCommentor;
	
	@Column(name = "created")
	private Date created = new Date();

	@ManyToOne
	@JoinColumn(name = "blog_id")
	private Blog blog;

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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	public List<Reply> getReplies() {
		return replies;
	}


	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}
	
	
}
