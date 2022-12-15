/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Mostafa
 */
public class Triangle {
    public void area(float base,float heighest)
    {
        double area;
        area = 0.5 * base * heighest;
        System.out.println("Area = "+area);
    }
    public void circumference(float a,float b,float c)
    {
        double circum;
        circum = a + b + c;
        System.out.println("circumference = "+circum);
    }
    
}
