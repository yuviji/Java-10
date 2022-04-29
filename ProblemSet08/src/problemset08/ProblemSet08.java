package problemset08;
import java.util.*;

public class ProblemSet08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an even number of teams: ");
        int numTeams = 4;
        try{
            numTeams = Math.max(0, (scan.nextInt() / 2) * 2);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input - set to " + numTeams + " teams");
        }
        if (numTeams > 0){
            System.out.println(numTeams + " teams:");
            String[] teams = new String[numTeams];
            for (int i = 0; i < numTeams; i++){
                System.out.print("Team #" + (i + 1) + "'s name (1 word): ");
                teams[i] = scan.next();
            }
            Scheduler master = new Scheduler(teams);
            int coldStreak = 0;
            while (coldStreak < 3){
                System.out.println("");
                System.out.print("Enter temperature (°C): ");
                int temp = scan.nextInt();
                if (temp > 0){
                    master.schedule(temp);
                    coldStreak = 0;
                }
                else{
                    System.out.println("Too cold to play.");
                    coldStreak++;
                }
            }
            System.out.println("Season is over.");
            System.out.println("\n\n\n*********RESULTS*********\n\n\n");
            master.display();
            System.out.println("");
            System.out.println("Hottest game: " + master.getHottest() + "°C");
            System.out.println("Average temperature: " + master.getAvgTemp() + "°C");
        }
        else{
            System.out.println("Not enough teams - no season!");
        }
    }
    
}
