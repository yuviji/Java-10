/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


public class CountChar {


    public static void main(String[] args) {

        String str = "www.oracle.com";
        
        int max = str.length();
        int count = 0;

        for (int i = 0; i < max; i++){
            if (str.charAt(i) == 'w')
                count++;
        }        

        System.out.println("Number of w : " + count );
    }
}
    

