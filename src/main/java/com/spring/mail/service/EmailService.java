package com.spring.mail.service;

import com.spring.mail.model.EmailDetails;

public interface EmailService {

	//Method to send simple email
		String sendSimpleMail(EmailDetails details);
		
		//Method to send an email with attachment
		String sendMailWithAttachment(EmailDetails details);

	
}
