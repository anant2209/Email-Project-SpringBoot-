package com.mail.di.model;

public class EmailDetails {
	private String recipient;
	private String body;
	private String subject;
	

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}



	public EmailDetails(String recipient, String body, String subject) {
		super();
		this.recipient = recipient;
		this.body = body;
		this.subject = subject;
		
	}

	public EmailDetails() {
	}

}
