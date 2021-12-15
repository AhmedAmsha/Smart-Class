/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SmartClass.SmartClassApp.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Ahmed
 */
@RestController

public class MainController 
{
    @RequestMapping("/")
    public String index()
    {
     return "Hello ";   
    }
}
