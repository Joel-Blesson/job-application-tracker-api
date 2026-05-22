package com.joel.demo.service;

import com.joel.demo.model.JobApplication;
import com.joel.demo.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public JobApplication createJob(JobApplication jobApplication) {

        return jobRepository.save(jobApplication);
    }

    @Override
    public List<JobApplication> getAllJobs() {

        return jobRepository.findAll();
    }

    @Override
    public List<JobApplication> getJobsByStatus(String status) {

        return jobRepository.findByStatus(status);
    }
}