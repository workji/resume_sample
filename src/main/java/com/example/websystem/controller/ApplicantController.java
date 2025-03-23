package com.example.websystem.controller;

import com.example.websystem.model.Applicant;
import com.example.websystem.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping("/applicant-form")
    public String showApplicantForm(Model model) {
        model.addAttribute("applicant", new Applicant());
        return "applicant-form";
    }

    @PostMapping("/applicant-submit")
    public String submitApplication(Applicant applicant) {
        applicantService.save(applicant);
        applicantService.sendConfirmationEmail(applicant);
        return "redirect:/applicant-success";
    }

    @GetMapping("/applicant-success")
    public String applicationSuccess() {
        return "applicant-success"; // This view should be created to show success message
    }
}