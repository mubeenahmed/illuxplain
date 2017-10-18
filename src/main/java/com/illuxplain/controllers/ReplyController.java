package com.illuxplain.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.illupxlain.utils.GeneratingDataUtils;
import com.illuxplain.models.Reply;

@RestController
public class ReplyController {
	
	@RequestMapping(value = "reply_submitter", method = RequestMethod.POST)
	public String saveReply(@ModelAttribute Reply reply) {
//		try {
//			boolean result = presistenceRepository.save(createInertQueryReply(), createParameter(reply));
//			return "Ok";
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return null;
	}
	
//	private String createInertQueryReply() {
//		return "INSERT INTO replies(name,reply,comment_id,created_at) VALUES(?,?,?,?)";
//	}
	
//	private Object[] createParameter(Reply reply) {
//		GeneratingDataUtils date = new GeneratingDataUtils();
//		return new Object[]{reply.getName(), reply.getReply(), reply.getCommentId(), date.getUnixTime()};
//	}
}
