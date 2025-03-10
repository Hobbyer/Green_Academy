package com.green.emp_manager.controller;

import com.green.emp_manager.dto.DeptDTO;
import com.green.emp_manager.service.DeptService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depts")
public class DeptController {
  private final DeptService deptService;

  public DeptController(DeptService deptService) {
    this.deptService = deptService;
  }

  @GetMapping("")
  public List<DeptDTO> deptList(){
    return deptService.deptList();
  }

  @PostMapping("")
  public int insertDept(@RequestBody DeptDTO deptDTO){
    return deptService.insertDept(deptDTO);
  }

  @DeleteMapping("/{deptNo}")
  public int deleteDept(@PathVariable("deptNo") int deptNo){
    return deptService.deleteDept(deptNo);
  }
}
