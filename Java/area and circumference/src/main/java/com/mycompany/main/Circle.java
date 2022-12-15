/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Mostafa
 */
public class Circle {
    public void area(float r)
    {
        double area;
        area = Math.PI * r * r;
        System.out.println("Area = "+area);
    }
    public void circumference(float r)
    {
        double circum;
        circum = 2 * Math.PI * r;
        System.out.println("circumference = "+circum);
    }
}
