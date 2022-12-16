/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multiplication;

/**
 *
 * @author Mostafa
 */
public class Multiplication {

    public static void main(String[] args) {
                Multiply m1 = new Multiply();
        
        int ro1 = 4, co1 = 3, ro2 = 3, co2 = 4;
 
        int a[][] = { { 1, 1, 1 },
                      { 2, 2, 2 },
                      { 3, 3, 3 },
                      { 4, 4, 4 } };
 
        int b[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 } };
        m1.multiplyMatrix(ro1, co1, a, ro2, co2, b);
        
        
    }
}
