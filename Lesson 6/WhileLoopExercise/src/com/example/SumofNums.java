/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int number = 0, sum = 0, count = 0;        
        do{
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
            count++;
            sum += number;
        } while (number != -1 && count < 10);
        if (number == -1)
            sum--;
        System.out.println("The sum is " + sum);

    }
}
