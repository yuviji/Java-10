/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.Scanner;
/**
 *
 * @author anshenoy
 */
public class TestClass {

    public static void main(String args[]) {        
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
        Scanner scan = new Scanner(System.in);
        ComputeMethods comp = new ComputeMethods();
        System.out.print("Enter temperature in fahrenheit: ");
        System.out.println("Temperature in celsius is " + comp.fToC(scan.nextDouble()));
        System.out.print("Enter side A: ");
        int a = scan.nextInt();
        System.out.print("Enter side B: ");
        int b = scan.nextInt();
        System.out.println("Hypotenuse is " + comp.hypotenuse(a, b));
        System.out.println("The sum of the dice value is " + comp.roll());
        
    }
}
