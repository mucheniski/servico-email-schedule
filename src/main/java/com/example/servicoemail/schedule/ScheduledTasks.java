package com.example.servicoemail.schedule;

import com.example.servicoemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0 20 * * *") // Executa às 20h00 todos os dias
    public void sendDailyEmail() throws MessagingException {
        String to = "destinatario@example.com";
        String subject = "Assunto do email";
        String text = "Conteúdo do email";
        emailService.sendEmail(to, subject, text);
        System.out.println("Email enviado às " + dateFormat.format(new Date()));
    }
}
