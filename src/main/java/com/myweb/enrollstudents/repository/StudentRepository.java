package com.myweb.enrollstudents.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myweb.enrollstudents.entity.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	
	
	    
	    List<Student> findByName(String name);
	
}

