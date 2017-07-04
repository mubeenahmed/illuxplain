package com.illuxplain.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.illupxlain.utils.GeneratingDataUtils;
import com.illuxplain.models.Contact;
import com.illuxplain.repository.MySqlContactPresistence;

@Controller
public class ContactController {
	
	@Autowired
	@Qualifier("mysqlContactRepo")
	MySqlContactPresistence<Contact> contactRepo;
	
	@RequestMapping(value = "contact")
	public ModelAndView contact() {
		ModelAndView modelAndView = new ModelAndView("contact");
		return modelAndView;
	}
	
	@RequestMapping(value = "submit_contact", method = RequestMethod.POST)
	public ModelAndView submitContact(@ModelAttribute Contact contact) {
		Object[] params = createParameter(contact);
		String query = createInsertQuery();
		try {
			boolean saved = contactRepo.save(query, params);
			return new ModelAndView("redirect:contact");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	private Object[] createParameter(Contact contact) {
		String name = contact.getName();
		String email = contact.getEmail();
		String message = contact.getMessage();
		long created = createdTime();
		return new Object[]{name, email, message, created};
	}
	
	private String createInsertQuery() {
		String query = "INSERT INTO contact (`name`,`email`,`message`, `created_at`) VALUES(?,?,?,?)";
		return query;
	}
	
	private long createdTime(){
		GeneratingDataUtils generatingForUnixTimeStamp = new GeneratingDataUtils();
		long created = generatingForUnixTimeStamp.getUnixTime();
		return created;
	}
}
