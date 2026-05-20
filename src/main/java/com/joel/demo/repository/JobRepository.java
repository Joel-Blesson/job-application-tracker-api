package com.joel.demo.repository;

import com.joel.demo.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobApplication, Integer> {
}