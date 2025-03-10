package com.green.emp_manager.service;

import com.green.emp_manager.dto.JobDTO;
import com.green.emp_manager.mapper.JobMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {
  private final JobMapper jobMapper;

  @Override
  public List<JobDTO> jobList() {
    return jobMapper.jobList();
  }

  @Override
  public int insertJob(JobDTO jobDTO) {
    return jobMapper.insertJob(jobDTO);
  }

  @Override
  public int deleteJob(int jobNo) {
    return jobMapper.deleteJob(jobNo);
  }
}
