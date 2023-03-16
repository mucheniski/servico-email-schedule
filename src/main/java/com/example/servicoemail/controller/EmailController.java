package com.example.servicoemail.controller;

import com.example.servicoemail.dto.EmailRequest;
import com.example.servicoemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.Map;

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

    @PostMapping("/enviar-template")
    public ResponseEntity<String> sendEmailWithTemplate(@RequestBody EmailRequest emailRequest) throws MessagingException {
        Map<String, Object> templateModel = new HashMap<>();
        templateModel.put("nome", "Fulano");
        emailService.sendEmailWithTemplate(emailRequest.getTo(), emailRequest.getSubject(), templateModel);
        return ResponseEntity.ok("Email enviado com sucesso.");
    }


}
