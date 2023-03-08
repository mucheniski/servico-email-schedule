package com.example.servicoemail.controller;

import com.example.servicoemail.dto.EmailRequest;
import com.example.servicoemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/enviar")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) throws MessagingException {
        emailService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getText());
        return ResponseEntity.ok("Email enviado com sucesso.");
    }

}
