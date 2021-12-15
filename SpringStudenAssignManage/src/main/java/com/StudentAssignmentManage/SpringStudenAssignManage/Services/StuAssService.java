/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentAssignmentManage.SpringStudenAssignManage.Services;

import com.StudentAssignmentManage.SpringStudenAssignManage.Repositers.StuAssRepositery;
import com.StudentAssignmentManage.SpringStudenAssignManage.VO.Assignment;
import com.StudentAssignmentManage.SpringStudenAssignManage.VO.ResponseTemplateVO;
import com.StudentAssignmentManage.SpringStudenAssignManage.models.StudentAssignment;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Ahmed
 */
@Service
@Slf4j
public class StuAssService {
       @Autowired
       StuAssRepositery studAssRepositery;
       
  @Autowired
  private RestTemplate restTemplate;
  
  public List getAllStuAssignment() {
    return   studAssRepositery.findAll();
  } 
  
  public StudentAssignment saveStudentAssignment(StudentAssignment studentAssignment)
  {
      log.info("Inside save Assignment Service in AssignmentServices");
      return studAssRepositery.save(studentAssignment);
  }

    public StudentAssignment findStudentAssignmentById(Integer stuAssID) {
      log.info("Inside findAssignmentById Service in AssignmentServices");
      return studAssRepositery.findStudentByID(stuAssID);
    }

    public ResponseTemplateVO getStuWithAssignment(Integer stuAssId) {
        log.info("Inside getStudentWithAssignment Service in AssignmentServices");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        StudentAssignment studentAssignment = studAssRepositery.findStudentByID(stuAssId);
        Assignment assignment = 
                restTemplate.getForObject("http://ASSIGNMENT-SERVICE/assignments/"+ studentAssignment.getAssgID() 
                , Assignment.class);
        vo.setStudentAssignment(studentAssignment);
        vo.setAssignment(assignment);
        return vo;
    }

    
}
