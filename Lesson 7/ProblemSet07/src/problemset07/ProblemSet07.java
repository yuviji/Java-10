/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemset07;
import java.util.*;
/**
 *
 * @author Yuvi
 */
public class ProblemSet07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Yuvraj's Arcade!\n");
        String[] pNames = new String[3];
        int[] pCosts = new int[3];
        int[] pUnits = new int[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Please enter the name of Prize " + (i + 1) + ": ");
            pNames[i] = scan.next();
            System.out.println("Please enter the ticket cost of " + pNames[i] + ": ");
            pCosts[i] = scan.nextInt();
            System.out.println("Please enter the number of units of " + pNames[i] + ": ");
            pUnits[i] = scan.nextInt();
        }
        Card c1 = new Card();
        Card c2 = new Card();
        Game g1 = new Game(3);
        Terminal t1 = new Terminal(pNames, pCosts, pUnits);
        t1.loadCard(69, c1);
        t1.loadCard(42, c2);
        for (int i = 0; i < 3; i++){
            g1.play(c1);
            g1.play(c2);
        }
        t1.transferTickets(c2, c1);
        t1.transferCreds(c1, c2);
        t1.getPrize("Snake", c2);
        g1.play(c1);
        t1.getPrize("Coffee", c1);
        t1.getPrize("Pony", c2);
    }
    
}
