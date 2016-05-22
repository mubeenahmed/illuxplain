package com.illuxplain.app;

public class CommentsImp implements CommentsInt {

	private Comments comment;
	public CommentsImp(Comments newComment) {
		comment = newComment;
	}
	
	@Override
	public boolean saveComment() {		
		if(isCommentNull() || isCommentEmpty()){
			return false;
		}
		else{
			return true;
		}
		
	}
	
	private boolean isCommentNull(){
		return comment.getNameOfCommentor() == null || comment.getCommentText() == null;
	}
	private boolean isCommentEmpty(){
		return comment.getNameOfCommentor().equals("") || comment.getCommentText().equals("");
	}

}
