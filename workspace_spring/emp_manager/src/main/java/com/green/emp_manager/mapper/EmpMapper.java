package com.green.emp_manager.mapper;

import com.green.emp_manager.dto.EmpDTO;
import com.green.emp_manager.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
  public List<EmpDTO> empList(SearchDTO searchDTO);

  public int insertEmp(EmpDTO empDTO);

  public int deleteEmp(EmpDTO empDTO);
}
