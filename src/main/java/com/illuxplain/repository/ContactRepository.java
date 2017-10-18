package com.illuxplain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.illuxplain.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
