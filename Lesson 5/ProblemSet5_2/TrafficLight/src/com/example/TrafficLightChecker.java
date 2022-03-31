/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a color code: ");
        int c = scan.nextInt();
        if (c == 1){
            System.out.println("Next Traffic Light is green");
        }
        if (c == 2){
            System.out.println("Next Traffic Light is yellow");
        }
        else if (c == 3){
            System.out.println("Next Traffic Light is red");
        }
        else{
            System.out.println("Invalid color");
        }
    }

}
