/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j2048controller;

/**
 *
 * @author Yuvi
 */
public class J2048View {
    
    public void printScore(int score){
        System.out.println("Score: " + score);
    }
    public void draw(int[] board){
        for (int i : board){
            if (i == 0)
                System.out.print(String.format("%4c", '-'));
            else
                System.out.print(String.format("%4d", i));
        }
        System.out.println("");
    }
}
