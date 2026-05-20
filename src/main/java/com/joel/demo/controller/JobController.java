package com.joel.demo.controller;

import com.joel.demo.model.JobApplication;
import com.joel.demo.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public JobApplication createJob(@RequestBody JobApplication jobApplication) {
        return jobService.createJob(jobApplication);
    }

    @GetMapping
    public List<JobApplication> getAllJobs() {
        return jobService.getAllJobs();
    }
}