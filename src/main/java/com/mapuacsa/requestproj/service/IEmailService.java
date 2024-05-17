package com.mapuacsa.requestproj.service;

import com.mapuacsa.requestproj.model.Email;

public interface IEmailService {
    
    String sendEmail(Email details);

    String sendEmailWithAttachments(Email details);

}
