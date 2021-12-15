/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentAssignmentManage.SpringStudenAssignManage.Controllers;

import com.StudentAssignmentManage.SpringStudenAssignManage.Services.StuAssService;
import com.StudentAssignmentManage.SpringStudenAssignManage.models.StudentAssignment;
import com.StudentAssignmentManage.SpringStudenAssignManage.VO.ResponseTemplateVO;
import java.util.List;
import javax.xml.ws.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ahmed
 */
@RestController
@RequestMapping("/studentassignment")
@Slf4j

public class StuAssManag {
    @Autowired
    StuAssService stuAssService;
    
    @GetMapping("/")
    public String getData()
    {
     return "Just Return Data";
    }
    @GetMapping("/all")
    public List getAllStudentAssignment()
    {
       List a ;
       a = stuAssService.getAllStuAssignment();
       return a;
    }
    @PostMapping("/save")
    public StudentAssignment savaStudentAssignment(@RequestBody StudentAssignment studentAssignment)
    {
        log.info("Inside service save method ");
        return stuAssService.saveStudentAssignment(studentAssignment);
  
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getStudentWithAssignment(@PathVariable("id")Integer stuAssInegerId)
    {
        log.info("Inside getStudent Assignment of student AsssController");
        return stuAssService.getStuWithAssignment(stuAssInegerId);
        
        
    }
            
    
    @GetMapping("/stu/{id}")
    public StudentAssignment findStudentAssignmentById(@PathVariable("id") Integer studentAssID)
    {
        log.info("Inside findassigmentById method in Controller");
        return stuAssService.findStudentAssignmentById(studentAssID);
    }
    
   
    
}
