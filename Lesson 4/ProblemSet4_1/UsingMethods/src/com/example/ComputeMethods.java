/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class ComputeMethods {
    public double fToC(double degreesF){
        return (5.0/9.0) * (degreesF - 32);
    }
    public double hypotenuse(int a, int b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public int roll(){
        Random rand = new Random();
        return (rand.nextInt(5) + 1) + (rand.nextInt(5) + 1);
    }
}