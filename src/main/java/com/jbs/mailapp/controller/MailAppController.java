package com.jbs.mailapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbs.mailapp.entity.EmailDetails;
import com.jbs.mailapp.service.impl.EmailServiceImpl;

@RestController
public class MailAppController {
	
	@Autowired
	private EmailServiceImpl emailServiceImpl;
	
	@PostMapping("/send_simple_email")
	public ResponseEntity<String> sendSimpleEmail(@RequestBody EmailDetails emailDetails) {
		String status = emailServiceImpl.sendSimpleEmail(emailDetails);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@PostMapping("/send_email_with_attachment")
	public ResponseEntity<String> sendEmailWithAttachment(@RequestBody EmailDetails emailDetails) {
		String status = emailServiceImpl.sendEmailWithAttachment(emailDetails);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
