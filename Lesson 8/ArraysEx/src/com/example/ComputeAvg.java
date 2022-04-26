/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int scores[] = new int[5];
        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            System.out.print("Enter test score #" + (i + 1) + ": ");
            scores[i] = scan.nextInt();
            sum += scores[i];
        }
        System.out.println("Average score: " + (sum / ((double)(scores.length))));
    }

}
