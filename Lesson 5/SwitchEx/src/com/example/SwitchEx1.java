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
public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = scan.nextInt();
        String m;
        switch(month){
            case 1:
                m = "January";
                break;
            case 2:
                m = "February";
                break;
            case 3:
                m = "March";
                break;
            case 4:
                m = "April";
                break;
            case 5:
                m = "May";
                break;
            case 6:
                m = "June";
                break;
            case 7:
                m = "July";
                break;
            case 8:
                m = "August";
                break;
            case 9:
                m = "September";
                break;
            case 10:
                m = "October";
                break;
            case 11:
                m = "November";
                break;
            case 12:
                m = "December";
                break;
            default:
                m = "Invalid Month";
        }
        System.out.println(m);
    }
}
