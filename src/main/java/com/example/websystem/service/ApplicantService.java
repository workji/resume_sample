package com.example.websystem.service;

import com.example.websystem.model.Applicant;
import com.example.websystem.repository.ApplicantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    private static final Logger logger = LoggerFactory.getLogger(ApplicantService.class);

    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    private JavaMailSender mailSender;

    public void save(Applicant applicant) {
        applicantRepository.save(applicant);
    }

    public Applicant findApplicantById(Long id) {
        return applicantRepository.findById(id);
    }

    public void sendConfirmationEmail(Applicant applicant) {

        logger.debug("Sending confirmation email to: {}", applicant.getEmail());
        logger.debug("Mail sender: {}", mailSender);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(applicant.getEmail());
        message.setSubject("応募完了通知");
        message.setText("応募が完了しました。以下のリンクから情報を変更できます。");
        // ここにリンクを追加するロジックを実装する
        try {
            mailSender.send(message);
            logger.debug("Email sent successfully.");
        } catch (Exception e) {
            logger.error("Failed to send email.", e);
        }
    }
}