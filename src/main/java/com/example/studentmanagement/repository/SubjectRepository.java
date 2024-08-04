package com.example.studentmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentmanagement.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
	
	List<Subject> findAllById(Iterable<Long> ids);
}

