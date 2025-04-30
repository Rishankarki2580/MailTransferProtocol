package com.spring.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mail.model.EmailDetails;
import com.spring.mail.service.EmailService;

@RestController
public class EmailController {

	 @Autowired private EmailService emailService;
	 
	 @GetMapping("/hello")
	    public String sayHello() {
	        return "Hello, Spring Boot is working!";
	    }

	    // Sending a simple Email
	    @PostMapping("/sendMail")
	    public String sendMail(@RequestBody EmailDetails details)
	    {
	        String status
	            = emailService.sendSimpleMail(details);

	        return status;
	    }

	    // Sending email with attachment
	    @PostMapping("/sendMailWithAttachment")
	    public String sendMailWithAttachment(@RequestBody EmailDetails details)
	    {
	        String status
	            = emailService.sendMailWithAttachment(details);

	        return status;
	    }
	
}
