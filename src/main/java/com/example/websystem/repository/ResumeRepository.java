package com.example.websystem.repository;

import com.example.websystem.model.Resume;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ResumeRepository {

    @Insert("INSERT INTO resumes (id) VALUES (#{id})")
    void save(Resume resume);

    @Select("SELECT * FROM resumes WHERE id = #{id}")
    Resume findById(@Param("id") Long id);

    @Select("SELECT * FROM resumes")
    List<Resume> findAll();

    @Update("UPDATE resumes SET id = #{id} WHERE id = #{id}")
    void updateResume(Resume resume);

    @Delete("DELETE FROM resumes WHERE id = #{id}")
    void deleteById(@Param("id") Long id);

    @Select({
            "<script>",
            "SELECT * FROM resumes WHERE id IN",
            "<foreach item='id' collection='list' open='(' separator=',' close=')'>",
            "#{id}",
            "</foreach>",
            "</script>"
    })
    List<Resume> findAllByIds(List<Long> resumeIds);
}