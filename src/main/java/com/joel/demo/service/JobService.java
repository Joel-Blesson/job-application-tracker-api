package com.joel.demo.service;

import com.joel.demo.model.JobApplication;

import java.util.List;

public interface JobService {

    JobApplication createJob(JobApplication jobApplication);

    List<JobApplication> getAllJobs();
}