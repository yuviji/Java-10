/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemset07;

/**
 *
 * @author Yuvi
 */
public class Card {
    private static int nextCard = 0;
    private int credit;
    private int ticket;
    private final int number;
    
    public Card(){
        this.credit = 0;
        this.ticket = 0;
        this.number = ++nextCard;
    }
    
    public int getCredit(){
        return this.credit;
    }
    public int getTicket(){
        return this.ticket;
    }
    public int getNumber(){
        return this.number;
    }
    public static int getNextCard(){
        return Card.nextCard;
    }
    
    public void setCredit(int credit){
        this.credit = credit;
    }
    public void setTicket(int ticket){
        this.ticket = ticket;
    }
}
