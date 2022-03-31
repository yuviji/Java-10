
package com.example;
import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a color code: ");
        int c = scan.nextInt();
        switch (c){
            case 1:
                System.out.println("Next Traffic Light is green");
                break;
            case 2:
                System.out.println("Next Traffic Light is yellow");
                break;
            case 3:
                System.out.println("Next Traffic Light is red");
                break;
            default:
                System.out.println("Invalid color");
        }
       
    }

}
