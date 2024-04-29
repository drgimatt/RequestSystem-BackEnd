package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Email;

public interface IEmailService {
    
    String sendEmail(Email details);

    String sendEmailWithAttachments(Email details);

}
