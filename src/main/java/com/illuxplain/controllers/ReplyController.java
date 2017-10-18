package com.illuxplain.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.illuxplain.models.Reply;

@RestController
public class ReplyController {

	@RequestMapping(value = "reply_submitter", method = RequestMethod.POST)
	public String saveReply(@ModelAttribute Reply reply) {
		boolean result = true; // presistenceRepository.save(createInertQueryReply(), createParameter(reply));
		return "Ok";
	}

}
