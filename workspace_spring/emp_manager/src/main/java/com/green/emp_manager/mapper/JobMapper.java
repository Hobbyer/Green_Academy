package com.green.emp_manager.mapper;

import com.green.emp_manager.dto.JobDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobMapper {
  public List<JobDTO> jobList();

  public int insertJob(JobDTO jobDTO);

  public int deleteJob(int jobNo);
}
