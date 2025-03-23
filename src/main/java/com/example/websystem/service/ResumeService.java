package com.example.websystem.service;

import com.example.websystem.model.Resume;
import com.example.websystem.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {

    private final ResumeRepository resumeRepository;

    @Autowired
    public ResumeService(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    public List<Resume> getAll() {
        return resumeRepository.findAll();
    }

    public List<Resume> getAllByIds(List<Long> resumeIds) {
        return resumeRepository.findAllByIds(resumeIds);
    }

    public Resume getById(Long id) {
        return resumeRepository.findById(id);
    }

    public void save(Resume resume) {
        resumeRepository.save(resume);
    }

    public void delete(Long id) {
        resumeRepository.deleteById(id);
    }
}