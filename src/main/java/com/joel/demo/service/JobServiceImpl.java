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

    @Override
    public JobApplication updateJob(Integer id, JobApplication updatedJob) {

        JobApplication existingJob = jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job with id" + id + " not found"));

        existingJob.setCompany(updatedJob.getCompany());
        existingJob.setRole(updatedJob.getRole());
        existingJob.setStatus(updatedJob.getStatus());

        return jobRepository.save(existingJob);
    }

    @Override
    public void deleteJob(Integer id) {

        JobApplication existingJob = jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(" Job with id + id +  not found"));

        jobRepository.delete(existingJob);
    }

    @Override
    public List<JobApplication> searchByCompany(String company) {
        return jobRepository.findByCompanyContainingIgnoreCase(company);
    }

    @Override
    public List<JobApplication> searchByRole(String role) {
        return jobRepository.findByRoleContainingIgnoreCase(role);
    }


}