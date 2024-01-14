package com.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.students.entity.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer>{

}
