package problemset07;

public class Terminal {
    //Fields
    PrizeCategory prize1;
    PrizeCategory prize2;
    PrizeCategory prize3;
    
    //Constructor
    public Terminal(){
        prize1 = new PrizeCategory("Candy", 10, 3);
        prize2 = new PrizeCategory("Glasses", 20, 3);
        prize3 = new PrizeCategory("Hat", 30, 3);
    }
    
    //Methods
    public void addCredits(Card card, int money){
        if(money < 0){
            System.out.println("Cannot add negative amount");
        }
        else{
            card.setCredits(card.getCredits() +money*2);
        }
    }
    public void printBalance(Card card){
        System.out.println("Card #" +card.getCardNumber());
        System.out.println("Credits: " +card.getCredits());
        System.out.println("Tickets: " +card.getTickets());
    }
    
    public void transferCredits(Card cardGiving, Card cardRecieving){
        transferCredits(cardGiving, cardRecieving, cardGiving.getCredits());
    }
    public void transferCredits(Card cardGiving, Card cardRecieving, int credits){
        if(cardGiving.getCredits() - credits <0){
            System.out.println("Not enough credits on Card #" +cardGiving.getCardNumber());
        }
        else{
            cardRecieving.setCredits(cardRecieving.getCredits() +credits);
            cardGiving.setCredits(cardGiving.getCredits() -credits);
        }
        System.out.println("Transfer " +credits +" credits from Card #" +cardGiving.getCardNumber() +" to Card #" +cardRecieving.getCardNumber());
        printBalance(cardGiving);
        printBalance(cardRecieving);
    }
    
    public void transferTickets(Card cardGiving, Card cardRecieving){
        transferTickets(cardGiving, cardRecieving, cardGiving.getTickets());
    }
    public void transferTickets(Card cardGiving, Card cardRecieving, int tickets){
        if(cardGiving.getTickets() - tickets <0){
            System.out.println("Not enough tickets on Card #" +cardGiving.getCardNumber());
        }
        else{
            cardRecieving.setTickets(cardRecieving.getTickets() +tickets);
            cardGiving.setTickets(cardGiving.getTickets() -tickets);
        }
        System.out.println("Transfer " +tickets +" tickets from Card #" +cardGiving.getCardNumber() +" to Card #" +cardRecieving.getCardNumber());
        printBalance(cardGiving);
        printBalance(cardRecieving);
    }
    
    public void requestPrize(String name, Card card){
        PrizeCategory prizeRequested;
        if(name.equalsIgnoreCase(prize1.getName())){
            prizeRequested = prize1;
            vendPrize(prizeRequested, card);
        }
        else if(name.equalsIgnoreCase(prize2.getName())){
            prizeRequested = prize2;
            vendPrize(prizeRequested, card);
        }
        else if(name.equalsIgnoreCase(prize3.getName())){
            prizeRequested = prize3;
            vendPrize(prizeRequested, card);
        }
        else{
            System.out.println("Error: no item category " +name);
        }
    }
    private void vendPrize(PrizeCategory prize, Card card){
        if(card.getTickets() < prize.getTicketsRequired()){
            System.out.println("Not enough Tickets.");
            System.out.println(prize.getName() +" requires " +prize.getTicketsRequired() +" tickets.");
            printBalance(card);
        }
        else if(prize.getItemCount() <= 0){
            System.out.println("This prize is gone.");
        }
        else{
            prize.setItemCount(prize.getItemCount() -1);
            card.setTickets(card.getTickets() - prize.getTicketsRequired());
            System.out.println("You win a " +prize.getName() +"!");
            System.out.println("Remaining " +prize.getName() +": " +prize.getItemCount());
            printBalance(card);
        }
    }
}
