package com.example.websystem.model;

import java.util.Date;

public class Resume {
    private Long id;
    private Long applicantId;
    private String template;
    private String content;
    private Date createdDate;
    private Date updatedDate;

    public Resume() {
    }

    public Resume(Long id, Long applicantId, String template, String content, Date createdDate, Date updatedDate) {
        this.id = id;
        this.applicantId = applicantId;
        this.template = template;
        this.content = content;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}