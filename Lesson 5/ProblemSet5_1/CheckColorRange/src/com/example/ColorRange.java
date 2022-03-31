/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a color code: ");
            double w = scan.nextDouble();
            if (w >= 380 && w < 450){
                System.out.println("Violet");
            }
            else if (w >= 450 && w < 495){
                System.out.println("Blue");
            }
            else if (w >= 495 && w < 570){
                System.out.println("Green");
            }
            else if (w >= 570 && w < 590){
                System.out.println("Yellow");
            }
            else if (w >= 590 && w < 620){
                System.out.println("Orange");
            }
            else if (w >= 620 && w < 750){
                System.out.println("Red");
            }
            else {
                System.out.println("The entered wavelength is not a part of the visible spectrum");
            }
        }
    }
