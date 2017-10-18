package com.illuxplain.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.illupxlain.utils.GeneratingDataUtils;
import com.illuxplain.models.Contact;

@Controller
public class ContactController {

	@RequestMapping(value = "contact")
	public String contact() {
//		ModelAndView modelAndView = new ModelAndView("contact");
//		return modelAndView;
		return "contact";
	}

	@RequestMapping(value = "submit_contact", method = RequestMethod.POST)
	public String submitContact(@ModelAttribute Contact contact, RedirectAttributes attr) {
		boolean saved = true; // contactRepo.save(query, params);
		if (saved) {
			attr.addFlashAttribute("success", "Thank you for contacting us. We will contact you soon");
		} else {
			attr.addFlashAttribute("success", "oops! something goes wrong");
		}
		return "redirect:contact";
	}

}
