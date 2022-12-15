/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortarray;

/**
 *
 * @author Mostafa
 */
//creat a public class array 
public class Array {
    //creat a methode that receive an array and sort it
    public void sort(int ar[])
    {
        int temp =0;
        //looping on the elements of array
        for (int i = 0; i < ar.length; i++) 
        {
            //cheak by one elment for all elements in the array
            for (int j = i+1; j < ar.length; j++) 
            {
                //cheak if the elment bigger than the element after
                if(ar[i] > ar[j])
                {
                    //swap between the two elements
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }  
            }   
        }  
    }
    
}
