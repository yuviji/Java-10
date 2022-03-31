/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args)
	{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the weight in pounds: ");
            double weight = scan.nextDouble();
            System.out.print("Enter the height in inches: ");
            double height = scan.nextDouble();
            System.out.println("Your Body Mass Index: " + Math.round(703 * (weight / (height * height))));
        }
}
