package com.green.emp_manager.service;

import com.green.emp_manager.dto.DeptDTO;

import java.util.List;

public interface DeptService {
  public List<DeptDTO> deptList();

  public int insertDept(DeptDTO deptDTO);

  public int deleteDept(int deptNo);
}
