package com.illuxplain.controllers;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.illuxplain.models.Comment;

@RestController
public class CommentController {

	@RequestMapping(value = "add-comment", method = RequestMethod.POST)
	public String submitHomeComment(@ModelAttribute Comment comment) {

		boolean isStored = true;// commentRepo.save(createInserQuery(), createParamsForInsertion(comment));
		if (isStored)
			return "OK";
		else
			return "FAILED";
	}

}
