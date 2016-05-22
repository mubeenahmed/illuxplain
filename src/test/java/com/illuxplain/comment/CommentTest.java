package com.illuxplain.comment;

import org.junit.Test;

import com.illuxplain.app.Comments;
import com.illuxplain.app.CommentsImp;
import com.illuxplain.app.CommentsInt;

import junit.framework.TestCase;

public class CommentTest extends TestCase{
	
	@Test
	public void testAddCommentEmptyNameAndComment(){
		Comments comment = new Comments();
		comment.setCommentText("  ");
		comment.setNameOfCommentor("");
		CommentsInt saveComment = new CommentsImp(comment);
		boolean expected = saveComment.saveComment();
		assertFalse(expected);
	}
	
	@Test
	public void testAddCommentEmptyComment(){
		Comments comment = new Comments();
		comment.setNameOfCommentor("mubeen");
		comment.setCommentText("");
		CommentsInt saveComment = new CommentsImp(comment);
		boolean expected = saveComment.saveComment();
		assertFalse(expected);
	}
	
	@Test
	public void testAddCommentEmptyName(){
		Comments comment = new Comments();
		comment.setNameOfCommentor("");
		comment.setCommentText("this is comment");
		CommentsInt saveComment = new CommentsImp(comment);
		boolean expected = saveComment.saveComment();
		assertFalse(expected);
	}
	
	
	@Test
	public void testAddCommentNameAndComment(){
		Comments comment = new Comments();
		comment.setNameOfCommentor("mubeen");
		comment.setCommentText("this is comment");
		CommentsInt saveComment = new CommentsImp(comment);
		boolean expected = saveComment.saveComment();
		assertTrue(expected);
	}
	
	@Test
	public void testAddCommentNullNameAndComment(){
		Comments comment = new Comments();
		CommentsInt saveComment = new CommentsImp(comment);
		boolean expected = saveComment.saveComment();
		assertFalse(expected);
	}
	
	@Test
	public void testAddCommentNullComment(){
		Comments comment = new Comments();
		comment.setNameOfCommentor("mubeen");
		CommentsInt saveComment = new CommentsImp(comment);
		boolean expected = saveComment.saveComment();
		assertFalse(expected);
	}
	
	@Test
	public void testAddCommentNullName(){
		Comments comment = new Comments();
		comment.setCommentText("THis si comme");
		CommentsInt saveComment = new CommentsImp(comment);
		boolean expected = saveComment.saveComment();
		assertFalse(expected);
	}
}
