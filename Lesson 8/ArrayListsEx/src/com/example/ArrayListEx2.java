/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++)
            numbers.add(i);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println("");
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) % 2 == 0)
                numbers.remove(i);
        }
        Iterator<Integer> it2 = numbers.iterator();
        while(it2.hasNext())
            System.out.print(it2.next() + " ");
    }
}
