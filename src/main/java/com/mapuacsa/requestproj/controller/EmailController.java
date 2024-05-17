package com.mapuacsa.requestproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapuacsa.requestproj.model.Email;
import com.mapuacsa.requestproj.service.EmailService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Email details)
    {
        String status = emailService.sendEmail(details);
        return status;
    }
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody Email details)
    {
        String status = emailService.sendEmailWithAttachments(details);
        return status;
    }

}
