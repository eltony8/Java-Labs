/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.asci;

import java.util.Scanner;

/**
 *
 * @author Mostafa
 */
public class Asci {

    public static void main(String[] args) {
       /*int x;
       Scanner in = new Scanner(System.in);
       x = in.next().charAt(0);
        System.out.printf("%d",x);*/
       
       char x;
       Scanner in = new Scanner(System.in);
       //recive a character from the user
       x = in.next().charAt(0);
       //type castig to the variable from char to int
       System.out.println((int)x);//display the asci code of the character
       
    }
}
