package com.green.emp_manager.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.green.emp_manager.dto.EmpDTO;
import com.green.emp_manager.dto.SearchDTO;
import com.green.emp_manager.service.EmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emps")
public class EmpController {
  private final EmpService empService;

//  public EmpController(EmpService empService) {
//    this.empService = empService;
//  }

  @GetMapping("")
  public List<EmpDTO> empList(SearchDTO searchDTO){
    System.out.println(searchDTO);
    return empService.empList(searchDTO);
  }

  @PostMapping("")
  public int insertEmp(@RequestBody EmpDTO empDTO){
    return empService.insertEmp(empDTO);
  }

  @DeleteMapping("")
  public int deleteEmp(@RequestBody EmpDTO empDTO){
    return empService.deleteEmp(empDTO);
  }
}
