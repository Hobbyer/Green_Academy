package com.green.emp_manager.mapper;

import com.green.emp_manager.dto.DeptDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
  public List<DeptDTO> deptList();

  public int insertDept(DeptDTO deptDTO);

  public int deleteDept(int deptNo);
}
