package com.green.emp_manager.service;

import com.green.emp_manager.dto.DeptDTO;
import com.green.emp_manager.mapper.DeptMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeptServiceImpl implements DeptService{
  private final DeptMapper deptMapper;

  @Override
  public List<DeptDTO> deptList() {
    return deptMapper.deptList();
  }

  @Override
  public int insertDept(DeptDTO deptDTO) {
    return deptMapper.insertDept(deptDTO);
  }

  @Override
  public int deleteDept(int deptNo) {
    return deptMapper.deleteDept(deptNo);
  }
}
