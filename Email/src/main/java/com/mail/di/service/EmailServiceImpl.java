package com.mail.di.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Service;

import com.mail.di.model.EmailDetails;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender mailsender;

	@Override
	public String sendSimpleMail(EmailDetails details) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("example@gmail.com");
		message.setTo(details.getRecipient());
		message.setText(details.getBody());
		message.setSubject(details.getSubject());

		mailsender.send(message);
		return "Mail Sent Successfully...";

	}

}
