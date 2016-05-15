package com.illuxplain.comment;

import org.junit.Test;

import junit.framework.TestCase;

public class CommentTest extends TestCase{
	
	@Test
	public void testAddCommentEmptyNameAndComment(){
		Comments comment = new Comments("","");
		boolean expected = comment.saveComment();
		assertFalse(expected);
	}
	
	@Test
	public void testAddCommentEmptyComment(){
		Comments comment = new Comments("","mubeen");
		boolean expected = comment.saveComment();
		assertFalse(expected);
	}
	
	@Test
	public void testAddCommentEmptyName(){
		Comments comment = new Comments("This is test","");
		boolean expected = comment.saveComment();
		assertFalse(expected);
	}
	
	@Test
	public void testAddCommentNameAndComment(){
		Comments comment = new Comments("This is test","mubeen");
		boolean expected = comment.saveComment();
		assertTrue(expected);
	}
}
