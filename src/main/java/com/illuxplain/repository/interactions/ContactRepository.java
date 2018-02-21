package com.illuxplain.repository.interactions;

import org.springframework.data.jpa.repository.JpaRepository;

import com.illuxplain.models.interactions.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
