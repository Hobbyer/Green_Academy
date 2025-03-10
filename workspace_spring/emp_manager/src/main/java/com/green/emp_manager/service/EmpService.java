package com.green.emp_manager.service;

import com.green.emp_manager.dto.EmpDTO;
import com.green.emp_manager.dto.SearchDTO;

import java.util.List;

public interface EmpService {
  public List<EmpDTO> empList(SearchDTO searchDTO);

  public int insertEmp(EmpDTO empDTO);

  public int deleteEmp(EmpDTO empDTO);
}
