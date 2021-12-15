/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SmartClass.SmartClassApp.models;

import java.sql.Time;
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
@Table(name = "assignmentmanag")
public class Assignment{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer ID;
    @Column(name = "Title")
    private String Title;
    @Column(name = "Text")
    private String Text;
    @Column(name = "FLink")
    private String fLink;
    @Column(name = "Date")
    private Date date;
    @Column(name = "Time")
    private Time time;
    @Column(name = "Grade")
    private String Grade;   
    @Column(name = "Avalble")
    private String Avalble;
    
    
    
    
}
