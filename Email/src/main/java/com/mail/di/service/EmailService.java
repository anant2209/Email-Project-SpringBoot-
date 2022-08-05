package com.mail.di.service;

import com.mail.di.model.EmailDetails;

public interface EmailService {
	String sendSimpleMail(EmailDetails details);

	
}
