/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1p3;

/**
 *
 * @author Emily Barrientos
 */
public class GFG {
    static int DAC_Max(int a[], int index, int l)
{
    int max;
    if(l - 1 == 0)
    {
      return a[index];
    }
    if (index >= l - 2)
    {
        if (a[index] > a[index + 1])
            return a[index];
        else
            return a[index + 1];
    }
 
    // Logic to find the Maximum element
    // in the given array.
    max = DAC_Max(a, index + 1, l);
 
    if (a[index] > max)
        return a[index];
    else
        return max;
}
 
// Function to find the minimum no.
// in a given array.
static int DAC_Min(int a[], int index, int l)
{
    int min;
    if(l - 1 == 0)
    {
      return a[index];
    }
    if (index >= l - 2)
    {
        if (a[index] < a[index + 1])
            return a[index];
        else
            return a[index + 1];
    }
 
    // Logic to find the Minimum element
    // in the given array.
    min = DAC_Min(a, index + 1, l);
 
    if (a[index] < min)
        return a[index];
    else
        return min;
}
 
// Driver Code
public static void main(String[] args)
{
     
    // Defining the variables
    int min, max;
 
    // Initializing the array
    int a[] = { 70, 250, 50, 80, 140, 12, 14 };
 
    // Recursion - DAC_Max function called
    max = DAC_Max(a, 0, 7);
 
    // Recursion - DAC_Max function called
    min = DAC_Min(a, 0, 7);
     
    System.out.printf("El numero minimo en" +
                      "la matriz danda es : %d\n", min);
    System.out.printf("TEl numero Maximo en " +
                      "la matriz danda es : %d", max);
}
}
