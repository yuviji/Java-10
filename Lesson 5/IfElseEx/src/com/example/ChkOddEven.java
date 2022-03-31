/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        System.out.println("The num is " + (num % 2 == 0 ? "even " : "odd ") + num);
    }
}
