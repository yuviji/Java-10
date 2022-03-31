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
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");

        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);

    }

    
}
