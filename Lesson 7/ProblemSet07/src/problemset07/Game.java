/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemset07;
import java.util.*;
/**
 *
 * @author Yuvi
 */
public class Game {
    private final int credits;
    
    public Game(int credits){
        this.credits = credits;
    }
    
    public int getCredits(){
        return this.credits;
    }
    
    public void play(Card card){
        if (card.getCredit() >= this.credits){
            card.setCredit(card.getCredit() - this.credits);
            Random rand = new Random();
            int won = rand.nextInt(69) + 1;
            card.setTicket(card.getTicket() + won);
            System.out.println("Card #: " + card.getNumber());
            System.out.println("Tickets Won: " + won);
            System.out.println("New Total: " + card.getTicket());
        }
        else{
            System.out.println("Insufficient funds!");
        }
    }
}
