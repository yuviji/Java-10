package prisontest;

import java.util.*;
public class PrisonTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter cell pin: ");
        int pin = scan.nextInt();
        Cell cell = new Cell("MCA", false, pin);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cell);
        bubba.display();
        for (int i = pin - 5; i <= pin; i++)
            cell.openDoor(i);
        for (int i = pin + 5; i >= pin; i--)
            cell.openDoor(i);
    }
}