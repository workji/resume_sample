package com.example.websystem.controller;

import com.example.websystem.model.Resume;
import com.example.websystem.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/resumes")
    public String listResumes(Model model) {
        List<Resume> resumes = resumeService.getAll();
        model.addAttribute("resumes", resumes);
        return "resume-list";
    }

    @GetMapping("/resumes/{id}")
    public String viewResume(@PathVariable Long id, Model model) {
        Resume resume = resumeService.getById(id);
        model.addAttribute("resume", resume);
        return "resume-view";
    }

    @PostMapping("/resumes/print")
    public String printResumes(List<Long> resumeIds, Model model) {
        List<Resume> selectedResumes = resumeService.getAllByIds(resumeIds);
        model.addAttribute("selectedResumes", selectedResumes);
        return "resume-print";
    }
}