package com.illuxplain.comment;


public class Comments implements CommentsInt{

	private String comment;
	private String name;
	
	public Comments(String comment, String name) {
		this.comment = comment;
		this.name = name;
	}
	
	@Override
	public boolean saveComment() {
		if(comment.equals("") || name.equals("")){
			return false;
		}
		return true;
	}
}
