package prisontest;

public class PrisonTest {
    public static void main(String[] args){
        Cell cellA1 = new Cell("A1", false, 1234);
        Cell cellB1 = new Cell("B1", false, 1234);
        Cell cellC1 = new Cell("C1", false, 1234);
        Cell cellD1 = new Cell("D1", false, 1234);
        
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cellA1);
        Prisoner twitch = new Prisoner("Twitch", 4.20, 3, cellB1);
        Prisoner ninja = new Prisoner("Ninja", 6.9, 1, cellC1);
        Prisoner skete = new Prisoner("Pete Davidson", 0.1, 100, cellD1);
        bubba.display();
        twitch.display();
        ninja.display();
        skete.display();
        
        System.out.println("Prisoners: "  +Prisoner.getPrisonerCount());
    }
}
