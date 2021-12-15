/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentAssignmentManage.SpringStudenAssignManage.VO;

import com.StudentAssignmentManage.SpringStudenAssignManage.models.StudentAssignment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ahmed
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseTemplateVO 
{
        private Assignment assignment;
        private StudentAssignment studentAssignment;
        
    
}
