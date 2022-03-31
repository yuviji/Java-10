package problemset07;

public class Game {
    //Fields
    private final int creditsRequired;
    
    //Constructor
    public Game(int creditsRequired){
        this.creditsRequired = creditsRequired;
    }
    
    //Getters
    public int getCreditsRequired(){
        return creditsRequired;
    }
    
    //Methods
    public void play(Card card){
        if(card.getCredits() >= creditsRequired){
            card.setCredits(card.getCredits() -creditsRequired);
            int ticketsWon = (int)(Math.random()*20);
            card.setTickets(card.getTickets() +ticketsWon);
            System.out.println("Card #" +card.getCardNumber());
            System.out.println(ticketsWon +" tickets won!");
            System.out.println(card.getTickets() +" tickets total!");
        }
        else{
            System.out.println("Insufficent Credits");
            
        }
    }
}
