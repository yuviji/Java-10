package connect4;

import java.util.*;

public class Connect4Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Connect 4!");
        System.out.print("Enter Player 1's Name: ");
        Player a = new Player(scan.nextLine());
        System.out.print("Enter Player 2's Name: ");
        Player b = new Player(scan.nextLine());
        Board game = new Board();

        do {
            game.display();
            int choice;
            System.out.println(a.getName() + "'s turn: ");
            choice = scan.nextInt();
            while (!game.insert(a, choice)) {
                System.out.println("Please enter a column number: ");
                choice = scan.nextInt();
            }
            game.display();
            if (!game.winner().equals(" ")) {
                break;
            }
            System.out.println(b.getName() + "'s turn: ");
            choice = scan.nextInt();
            while (!game.insert(b, choice)) {
                System.out.println("Please enter a column number: ");
                choice = scan.nextInt();
            }
            if (!game.winner().equals(" ")) {
                break;
            }
        } while (a.getCoins() > 0 && b.getCoins() > 0);
        String winner = game.winner();
        if (!winner.equals(" ")) {
            if (winner.equals(Character.toString(a.getNumber() + 64))) {
                System.out.println("\n" + a.getName() + " wins!");
            } 
            else if (winner.equals(Character.toString(b.getNumber() + 64))) {
                System.out.println("\n" + b.getName() + " wins!");
            }
        }
        else {
            System.out.println("Game Over! No winner!");
        }
    }

}
