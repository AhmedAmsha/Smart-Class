/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentAssignmentManage.SpringStudenAssignManage.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ahmed
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "studentassignmentmanag")
public class StudentAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer ID;
    @Column(name = "StudentID")
    private Integer StuID;
    @Column(name = "AssignmentID")
    private Integer AssgID;
    @Column(name = "RText")
    private String RebText;
    @Column(name = "ReplyFLink")
    private String RepfLink;
    @Column(name = "Grade")
    private Integer Grade;
    
    
}
