package problemset07;

public class ProblemSet07 {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Game game1 = new Game(5);
        Terminal terminal1 = new Terminal();
        
        terminal1.addCredits(card1, 20);
        terminal1.addCredits(card2, 20);
        
        for(int i = 0; i<5; i++){
            game1.play(card1);
        }
        for(int i = 0; i<5; i++){
            game1.play(card2);
        }
        
        terminal1.transferCredits(card1, card2);
        terminal1.transferTickets(card1, card2);
        
        terminal1.requestPrize("Candy", card2);
        game1.play(card1);
        
        terminal1.requestPrize("Candy", card1);
        terminal1.requestPrize("Candy", card2);
        terminal1.requestPrize("Candy", card2);
        terminal1.requestPrize("Candy", card2);
        
    }
}
