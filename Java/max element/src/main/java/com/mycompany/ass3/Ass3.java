/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ass3;

import java.util.Scanner;

/**
 *
 * @author Mostafa
 */
public class Ass3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //define array of 5 integers
        int arr[] = new int[5];
        //receiving the array
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = input.nextInt();
        }
        //putting the first element of the array in max
        int max = arr[0];
        //looping on the array
        for(int i = 0 ; i<arr.length ; i++)
        {
            //check if the element of array bigger than max 
            if(arr[i]>max)  
            {
                //put the element in max
                max = arr[i];
            }
        }
        //print the max element
        System.out.println("max = "+max);
        
    }
}
