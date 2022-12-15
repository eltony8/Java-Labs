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
        Circle c = new Circle();
        Triangle tr = new Triangle();
        c.area(5);
        c.circumference(5);
        tr.area(6,5);
        tr.circumference(2, 3,5);
    }
}
