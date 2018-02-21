package com.illuxplain.controllers.contact;

import com.illuxplain.repository.interactions.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.illuxplain.models.interactions.Contact;

@Controller
public class ContactController {

	@Autowired
	private ContactRepository contactRepository;

	@RequestMapping(value = "contact")
	public String contact() {
//		ModelAndView modelAndView = new ModelAndView("contact");
//		return modelAndView;
		return "contact";
	}

	@RequestMapping(value = "submit_contact", method = RequestMethod.POST)
	public String submitContact(@ModelAttribute Contact contact, RedirectAttributes attr) {
		Contact saved = contactRepository.saveAndFlush(contact);
		if (saved != null) {
			attr.addFlashAttribute("success", "Thank you for contacting us. We will contact you soon");
		} else {
			attr.addFlashAttribute("success", "oops! something goes wrong");
		}
		return "redirect:contact";
	}

}
