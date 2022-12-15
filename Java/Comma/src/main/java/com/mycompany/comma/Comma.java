/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.comma;

import java.util.Scanner;

/**
 *
 * @author Mostafa
 */
public class Comma {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //lopping on the string
        for(int i = 0 ; i<str.length() ; i++)
        {
            //check if ' is founded
            if(str.charAt(i)  == ',')
                //replace it by space
                str =str.replace(str.charAt(i),' ');      
        }
        System.out.println(str);
    }
}
