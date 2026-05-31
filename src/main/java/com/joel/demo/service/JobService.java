package com.joel.demo.service;

import com.joel.demo.model.JobApplication;

import java.util.List;

public interface JobService {

    JobApplication createJob(JobApplication jobApplication);

    List<JobApplication> getAllJobs();

    List<JobApplication> getJobsByStatus(String status);

    JobApplication updateJob(Integer id, JobApplication updatedJob);

    void deleteJob(Integer id);
}