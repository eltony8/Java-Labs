/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ass4;

import java.util.Scanner;

/**
 *
 * @author Mostafa
 */
public class Ass4 {

    public static void main(String[] args) {
        int row,col;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number of rows :");
        row = in.nextInt();//receiving the ros of 2-D Array 
        System.out.print("Enter number of col :");
        col = in.nextInt();//receiving the colomns of 2-D Array
        //define 2D Array of ros,colomns
        int arr[][] = new int [row][col];
        //Reciving the 2-D Array
        for(int i = 0 ; i <row ; i++)
        {
           for(int j=0 ; j<col ; j++)
           {
               System.out.printf("Enter arr [%d][%d] :",i,j);
               arr[i][j] = in.nextInt();
           }
        }
        //transpose the 2-D array
        for(int i = 0 ; i <col ; i++)
        {
           for(int j=0 ; j<row ; j++)
           {
               System.out.print(arr[j][i]+"\t");
           }
           System.out.println();
        }
        
    }
}
