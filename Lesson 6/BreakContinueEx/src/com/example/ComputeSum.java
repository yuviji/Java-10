package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 numbers.");
        System.out.println("Enter 0 to exit.");
        int num, sum = 0, count = 0;
        do{
            num = scan.nextInt();
            sum += num;
        } while (count < 10 && num != 0);
        System.out.println("The sum of the numbers entered is " + sum);

    }
}
