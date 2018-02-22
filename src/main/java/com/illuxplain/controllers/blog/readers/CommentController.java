package com.illuxplain.controllers.blog.readers;

import com.illuxplain.exceptions.NotFoundException;
import com.illuxplain.services.interactions.ICommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.illuxplain.models.interactions.Comment;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private ICommentServices commentServices;

	@PostMapping("/add")
	public ResponseEntity<?> submitHomeComment(@ModelAttribute Comment comment)
	{
		try {
			Comment c = commentServices.saveComment(comment);
			return ResponseEntity.ok(c);
		} catch (NotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("blog not found");
		}
	}

	@GetMapping("/get/all/{id}")
	public List<Comment> getCommentsByBlogId(@PathVariable Long id)
	{
		try {
			return commentServices.getCommentsByBlogId(id);
		} catch (NotFoundException e) {
			return new ArrayList<>();
		}
	}


}
