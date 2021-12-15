/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SmartClass.SmartClassApp.controllers;

import com.SmartClass.SmartClassApp.services.AssignmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SmartClass.SmartClassApp.models.Assignment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 *
 * @author Ahmed
 */
@RestController
@RequestMapping("/assignments")
@Slf4j
public class AssignmentManag {
    
    @Autowired
    AssignmentService assignmentService;
    @GetMapping("/")
    
    public String getData()
    {
     return "Just Return Data";
    }
    @GetMapping("/all")
    public List getAllAssignments()
    {
        List a ;
       a = assignmentService.getAllAsignments();
       
       return a;
    }
    @PostMapping("/save")
    public Assignment savaAssignment(@RequestBody Assignment assignment)
    {
        log.info("Inside service save method ");
        return assignmentService.saveAssignment(assignment);
  
    }
    @GetMapping("/{id}")
    public Assignment findAssignmentById(@PathVariable("id") Integer assignmentID)
    {
        log.info("Inside findassigmentById method in Controller");
        return assignmentService.findAssignmentById(assignmentID);
    }

     }
