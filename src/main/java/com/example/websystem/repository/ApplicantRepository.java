package com.example.websystem.repository;

import com.example.websystem.model.Applicant;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ApplicantRepository {
    @Insert("INSERT INTO applicants (name, email) VALUES (#{name}, #{email})")
    void save(Applicant applicant);

    @Select("SELECT * FROM applicants WHERE email = #{email}")
    Applicant findApplicantByEmail(@Param("email") String email);

    @Select("SELECT * FROM applicants")
    List<Applicant> findAllApplicants();

    @Select("SELECT * FROM applicants WHERE id = #{id}")
    Applicant findById(Long id);
}