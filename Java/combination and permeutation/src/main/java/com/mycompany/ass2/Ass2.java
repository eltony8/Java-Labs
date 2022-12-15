/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ass2;

import java.util.Scanner;

/**
 *
 * @author Mostafa
 */
public class Ass2 {
    //creat methode to calculat factorial
    static int factorial(int n)
    {
        int fact =1;
        //loop from 1 to the number that i give to it
        for(int i =1 ; i<=n ; i++)
        {
            //multiplay the numbers from 1 to n
            fact *=i;
        }
        //return result of factorial 
        return fact;
    }

    public static void main(String[] args) {
        int n,r,p,c;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();//receive the n
        r = in.nextInt();//receive the n
        //calculat ncr
        c = factorial(n)/(factorial(n-r)*factorial(r));
        //calculat npr
        p = factorial(n)/factorial(n-r);
        System.out.printf("%d C %d = %d\n",n,r,c);
        System.out.printf("%d P %d = %d",n,r,p);
                
    }
}
