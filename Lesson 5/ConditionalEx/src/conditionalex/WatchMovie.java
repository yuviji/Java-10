/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the movie ticket price: ");
        double price = scan.nextDouble();
        System.out.print("Enter the movie rating: ");
        int rating = scan.nextInt();
        System.out.println(((price >= 12.0 && rating == 5) ? "I'm" : "I am not") + " interested in watching the movie");
    }
}
