/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SmartClass.SmartClassApp.repositers;

import com.SmartClass.SmartClassApp.controllers.AssignmentManag;
import com.SmartClass.SmartClassApp.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed
 */
@Repository

public interface AssignmentReprosiyty  extends 
        JpaRepository<Assignment,Integer>
{

    public Assignment findAssignmentByID(Integer assignmentID); 
    
}
