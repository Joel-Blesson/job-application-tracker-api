package com.joel.demo.controller;

import com.joel.demo.model.JobApplication;
import com.joel.demo.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public JobApplication createJob(
            @RequestBody JobApplication jobApplication) {

        return jobService.createJob(jobApplication);
    }

    @GetMapping
    public List<JobApplication> getAllJobs() {

        return jobService.getAllJobs();
    }

    @GetMapping("/status/{status}")
    public List<JobApplication> getJobsByStatus(
            @PathVariable String status) {

        return jobService.getJobsByStatus(status);
    }

    @PutMapping("/{id}")
    public JobApplication updateJob(
            @PathVariable Integer id,
            @RequestBody JobApplication updatedJob) {

        return jobService.updateJob(id, updatedJob);
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteJob(
            @PathVariable Integer id) {

        jobService.deleteJob(id);

        return Map.of(
                "message",
                "Job deleted successfully"
        );
    }
}