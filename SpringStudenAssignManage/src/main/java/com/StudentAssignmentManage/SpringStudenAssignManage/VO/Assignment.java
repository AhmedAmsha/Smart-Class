/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StudentAssignmentManage.SpringStudenAssignManage.VO;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Assignment {

    private Integer ID;
    private String Title;
    private String Text;
    private String fLink;
    private Date date;
    private Time time;
    private String Grade;   
    private String Avalble;
      
}
