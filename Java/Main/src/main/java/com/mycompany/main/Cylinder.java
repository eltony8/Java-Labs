/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Mostafa
 */
public class Cylinder extends Circle {
        private double height ;
    public void setHeight(double y){
        this.height = y ;
    }
    public double getHeight(){
        return height ;
    }

    @Override
    public double area() 
    {
      return  super.area() * getHeight();
    }

    
}
    
}
