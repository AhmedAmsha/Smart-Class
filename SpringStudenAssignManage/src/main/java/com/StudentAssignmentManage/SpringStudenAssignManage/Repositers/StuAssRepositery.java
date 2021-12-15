/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentAssignmentManage.SpringStudenAssignManage.Repositers;

import com.StudentAssignmentManage.SpringStudenAssignManage.models.StudentAssignment;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed
 */
@Repository

public interface StuAssRepositery extends 
        JpaRepository<StudentAssignment, Integer>{
    public StudentAssignment findStudentByID(Integer stuAssID);
    
}
