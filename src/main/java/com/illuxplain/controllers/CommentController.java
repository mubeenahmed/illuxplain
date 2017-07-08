package com.illuxplain.controllers;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.illupxlain.utils.GeneratingDataUtils;
import com.illuxplain.models.Comments;
import com.illuxplain.repository.MySqlCommentPresistence;
import com.illuxplain.repository.PresistenceRepository;



@RestController
public class CommentController {
	
	@Autowired
	@Qualifier("mysqlCommentRepo")
	PresistenceRepository<Comments> commentRepo;
	
	@RequestMapping(value="add-comment" , method=RequestMethod.POST)
	public String submitHomeComment(@ModelAttribute Comments comment){
		
		try {
			boolean isStored = commentRepo.save(createInserQuery(), createParamsForInsertion(comment));
			if(isStored)
				return "OK";
			else
				return "FAILED";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "FAILED";
	}
	
	private String createInserQuery(){
		return "INSERT INTO comments (comment_text, comment_name, page_id, created) VALUE ( ?,?,?,? ) ";
	}
	
	private Object[] createParamsForInsertion(Comments comments){
		String commentText = comments.getCommentText();
		String commentorName = comments.getNameOfCommentor();
		String pageId = comments.getPageID();
		long created = createdTime();
		
		Object[] params = new Object[]{ commentText, commentorName, pageId, created};
		return params;
	}
	
	private long createdTime(){
		GeneratingDataUtils generatingForUnixTimeStamp = new GeneratingDataUtils();
		long created = generatingForUnixTimeStamp.getUnixTime();
		return created;
	}

	
}
