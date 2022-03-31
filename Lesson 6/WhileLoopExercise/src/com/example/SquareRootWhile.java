
package com.example;

import java.util.Scanner;
import java.lang.Math;

public class SquareRootWhile {
    public static void main(String args[])
    {
        System.out.print("Type a non-negative integer: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        while (number < 0) {
            System.out.print("Invalid number, try again: ");
            number = console.nextInt();
        }    
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
}
    
}
