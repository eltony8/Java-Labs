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
        private double redius ;
    private String color ;
    
    public void setRedius(double x){
        this.redius = x ;
    }
    public double getRedius(){
        return redius ;
    }
    public void setColor( String y){
        this.color = y ;
    }
    public String getColor(){
        return color ;
    }
    public double area () {
        return  Math.PI * getRedius() * getRedius();
    }
    
}
