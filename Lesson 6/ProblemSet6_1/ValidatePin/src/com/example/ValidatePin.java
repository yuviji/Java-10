/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin, in;
        System.out.print("Set the pin: ");
        pin = scan.nextInt();
        System.out.println("--------------------------------------------");
        do{
            System.out.print("Enter the pin: ");
            in = scan.nextInt();
        } while (in != pin);
        System.out.println("Succes! You are in.");
    }
}
