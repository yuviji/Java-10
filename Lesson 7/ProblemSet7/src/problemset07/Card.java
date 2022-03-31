package problemset07;

public class Card {
    //Fields
    private int credits;
    private int tickets;
    private static int nextCardNumber = 1; 
    private final int cardNumber;
    
    //Constructor
    public Card(){
        cardNumber = nextCardNumber++;
    }
    
    //Getters
    public int getCredits(){
        return credits;
    }
    public int getTickets(){
        return tickets;
    }
    public int getCardNumber(){
        return cardNumber;
    }
    public static int getNextCardNumber(){
        return nextCardNumber;
    }
    //Setters
    public void setCredits(int credits){
        this.credits = credits;
    }
    public void setTickets(int tickets){
        this.tickets = tickets;
    }
}
