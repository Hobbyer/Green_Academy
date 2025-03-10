package com.green.emp_manager.controller;

import com.green.emp_manager.dto.JobDTO;
import com.green.emp_manager.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
  private final JobService jobService;

  public JobController(JobService jobService) {
    this.jobService = jobService;
  }

  @GetMapping("")
  public List<JobDTO> jobList(){
    return jobService.jobList();
  }

  @PostMapping("")
  public int insertJob(@RequestBody JobDTO jobDTO){
    return jobService.insertJob(jobDTO);
  }

  @DeleteMapping("/{jobNo}")
  public int deleteJob(@PathVariable("jobNo") int jobNo){
    return jobService.deleteJob(jobNo);
  }
}
