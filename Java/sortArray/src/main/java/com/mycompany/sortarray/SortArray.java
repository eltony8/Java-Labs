/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sortarray;

/**
 *
 * @author Mostafa
 */
public class SortArray {
    public static void main(String[] args) {
        //creat an array with initial values
        int a[] = {5,4,44,2,59};
        //craet an object from clas Array
        Array arr = new Array();
        //calling method sort 
        arr.sort(a);
        //print the array after sorting
        for (int i = 0; i < a.length; i++) {
           System.out.println(a[i]);  
        }
       
    }
}
