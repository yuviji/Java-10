/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j2048controller;
import java.util.*;

/**
 *
 * @author Yuvi
 */
public class J2048Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int DIM = 4;
        int[] board = new int[DIM];
        J2048Model model = new J2048Model(DIM);
        J2048View view = new J2048View();
        Scanner scan = new Scanner(System.in);
        
        boolean quit = false;
        model.init(board);
        while(!quit && model.state(board) == 'P'){
            view.printScore(model.getScore());
            view.draw(board);
            System.out.print("Move: ");
            char move = Character.toLowerCase(scan.next().charAt(0));
            switch(move){
                case 'q':
                    quit = true;
                    break;
                case 'a':
                    model.moveLeft(board);
                    break;
                case 'd':
                    model.moveRight(board);
                    break;
                default:
                    System.out.println("Please enter a valid input.");
            }
            model.spawn(board);
        }
        view.printScore(model.getScore());
        view.draw(board);
        System.out.println(model.state(board) == 'W' ? "You Won!" : "Game Over!");
    }
    
}
