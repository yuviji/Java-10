/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.*;

public class NameMaker {
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String firstName, middleName, lastName, fullName;
        System.out.print("Enter first name: ");
        firstName = scan.next();
        System.out.print("Enter middle name: ");
        middleName = scan.next();
        System.out.print("Enter last name: ");
        lastName = scan.next();
        fullName = firstName + " " + middleName + " " + lastName;
    }
    
}
