/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemset07;

/**
 *
 * @author Yuvi
 */
public class Terminal {
    private Prize[] prizes = new Prize[3];
    
    public Terminal(String[] pNames, int[] pCosts, int[] pUnits){
        for (int i = 0; i < 3; i++)
            prizes[i] = new Prize(pNames[i], pCosts[i], pUnits[i]);
    }
    
    public void loadCard(int money, Card card){
        if (money > 0){
            card.setCredit(card.getCredit() + money * 2);
            System.out.println(card.getCredit());
        }
        else{
            System.out.println("Please give some money to load.");
        }
    }
    public void checkCard(Card card){
        System.out.println("Card #" + card.getNumber());
        System.out.println("Credits: " + card.getCredit());
        System.out.println("Tickets: " + card.getTicket());
    }
    public void transferCreds(Card rec, Card give){
        transferTickets(give.getCredit(), rec, give);
    }
    public void transferCreds(int amt, Card rec, Card give){
        if (give.getCredit() - amt < 0){
            System.out.println("Insufficient credits on card.");
        }
        else{
            rec.setCredit(rec.getCredit() + amt);
            give.setCredit(give.getCredit() - amt);
        }
        System.out.println("Transferred " + amt + " credits from Card #" + give.getNumber() + " to Card #" + rec.getNumber());
        checkCard(rec);
        checkCard(give);
    }
    public void transferTickets(Card rec, Card give){
        transferTickets(give.getTicket(), rec, give);
    }
    public void transferTickets(int amt, Card rec, Card give){
        if (give.getTicket() - amt < 0){
            System.out.println("Insufficient tickets on card.");
        }
        else{
            rec.setTicket(rec.getTicket() + amt);
            give.setTicket(give.getTicket() - amt);
        }
        System.out.println("Transferred " + amt + " tickets from Card #" + give.getNumber() + " to Card #" + rec.getNumber());
        checkCard(rec);
        checkCard(give);
    }
    public void getPrize(String name, Card card){
        for (Prize p : prizes){
            if (name.equals(p.getName())){
                if (p.getStock() <= 0){
                    System.out.println("There are no " + p.getName() + "s left!");
                }
                else if (card.getTicket() < p.getPrice()){
                    System.out.println("Insufficient funds for " + p.getName());
                }
                else{
                    card.setTicket(card.getTicket() - p.getPrice());
                    p.setStock(p.getStock() - 1);
                    System.out.println(p.getName() + " given! " + p.getStock() + " left.");
                }
                return;
            }
        }
        System.out.println(name + " not found!");        
    }
}
