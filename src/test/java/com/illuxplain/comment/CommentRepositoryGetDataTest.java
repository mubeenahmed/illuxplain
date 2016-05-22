package com.illuxplain.comment;

import java.util.List;

import org.junit.Test;

import com.illuxplain.app.Comments;
import com.illuxplain.repository.CommentRepository;
import com.illuxplain.repository.CommentRepositoryImp;
import com.illuxplain.repository.MySqlPresistence;

import junit.framework.TestCase;

public class CommentRepositoryGetDataTest extends TestCase{

	@Test
	public void testGetCommentsListFromRepositoryShouldHaveCommentObject(){
		CommentRepository commentRepTest = new CommentRepositoryImp(new MySqlPresistence());
		List<Comments> listOfComment = commentRepTest.getComment(null);
		
		int actual = listOfComment.size();
		assertEquals(1, actual);
	}
	
}
