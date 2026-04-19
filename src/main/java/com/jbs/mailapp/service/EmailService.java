package com.jbs.mailapp.service;

import com.jbs.mailapp.entity.EmailDetails;

public interface EmailService {
	String sendSimpleEmail(EmailDetails ed);
	String sendEmailWithAttachment(EmailDetails ed);
}
