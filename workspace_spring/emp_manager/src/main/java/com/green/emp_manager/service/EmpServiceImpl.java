package com.green.emp_manager.service;

import com.green.emp_manager.dto.EmpDTO;
import com.green.emp_manager.dto.SearchDTO;
import com.green.emp_manager.mapper.EmpMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpServiceImpl implements EmpService{
  private final EmpMapper empMapper;

  @Override
  public List<EmpDTO> empList(SearchDTO searchDTO) {
    return empMapper.empList(searchDTO);
  }

  @Override
  public int insertEmp(EmpDTO empDTO) {
    return empMapper.insertEmp(empDTO);
  }

  @Override
  public int deleteEmp(EmpDTO empDTO) {
    return empMapper.deleteEmp(empDTO);
  }
}
