package com.mapuacsa.requestproj.service;

import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.mapuacsa.requestproj.model.Email;


@Service

public class EmailService implements IEmailService{

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}") private String sender;

    @Override
    public String sendEmail(Email details) {
        try{
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMsgBody());
            mailMessage.setSubject(details.getSubject());

            // Sending the mail
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }
 
        // Catch block to handle the exceptions
        catch (Exception e) {
            return "Error while Sending Mail";
        }
    }

    @Override
    public String sendEmailWithAttachments(Email details) {
        // Creating a mime message
        jakarta.mail.internet.MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;
 
        try {
 
            // Setting multipart as true for attachments to
            // be send
            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(details.getRecipient());
            mimeMessageHelper.setText(details.getMsgBody());
            mimeMessageHelper.setSubject(details.getSubject());
 
            // Adding the attachment
            FileSystemResource file = new FileSystemResource(new File(details.getAttachment()));
 
            mimeMessageHelper.addAttachment(file.getFilename(), file);
 
            // Sending the mail
            javaMailSender.send(mimeMessage);
            return "Mail sent Successfully";
        }
 
        catch (jakarta.mail.MessagingException e) {
            e.printStackTrace();
            return "Error while sending mail!!!";
        }
    }
    }




