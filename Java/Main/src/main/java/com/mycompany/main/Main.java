/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author Mostafa
 */
public class Main {

    public static void main(String[] args) {
        Cylinder obj = new Cylinder() ;
        obj.setRedius(3);
        obj.setHeight(5);
        System.out.println(" area = " + obj.area());  
    }
}

