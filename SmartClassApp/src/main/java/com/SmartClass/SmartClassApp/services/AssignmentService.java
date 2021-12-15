/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SmartClass.SmartClassApp.services;

import com.SmartClass.SmartClassApp.repositers.AssignmentReprosiyty;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SmartClass.SmartClassApp.models.Assignment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Ahmed
 */
@Service
@Slf4j

public class AssignmentService {
    @Autowired
    AssignmentReprosiyty assinAssignmentReprosiyty;
            
  public List getAllAsignments() {
    return   assinAssignmentReprosiyty.findAll();
  } 
  
  public Assignment saveAssignment(Assignment assignment)
  {
      log.info("Inside save Assignment Service in AssignmentServices");
      return assinAssignmentReprosiyty.save(assignment);
  }

    public Assignment findAssignmentById(Integer assignmentID) {
      log.info("Inside findAssignmentById Service in AssignmentServices");
      return assinAssignmentReprosiyty.findAssignmentByID(assignmentID);
    }
}
