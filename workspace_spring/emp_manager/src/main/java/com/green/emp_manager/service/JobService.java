package com.green.emp_manager.service;

import com.green.emp_manager.dto.JobDTO;

import java.util.List;

public interface JobService {
  public List<JobDTO> jobList();

  public int insertJob(JobDTO jobDTO);

  public int deleteJob(int jobNo);
}
