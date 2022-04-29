package problemset08;
import java.util.Random;

public class Game {
    private static int games = 0;
    private final Team team1, team2;
    private final int id, temp;
    private int goals1, goals2;
    
    public Game(Team team1, Team team2, int temp){
        this.team1 = team1;
        this.team2 = team2;
        this.temp = temp;
        this.id = ++games;
    }
    
    public String getT1(){
        return this.team1.getName();
    }
    public String getT2(){
        return this.team2.getName();
    }
    public int getGoals1(){
        return this.goals1;
    }
    public int getGoals2(){
        return this.goals2;
    }
    
    public int play(){
        Random rand = new Random();
        this.goals1 = rand.nextInt((((int)(temp))/10) + 1);
        this.goals2 = rand.nextInt((((int)(temp))/10) + 1);
        this.team1.score(this.goals1);
        this.team1.concede(this.goals2);
        this.team2.score(this.goals2);
        this.team2.concede(this.goals1);
        if (this.goals1 > this.goals2)
            return 1;
        else if (this.goals2 > this.goals1)
            return 2;
        else
            return 0;
    }    
    public void display(){
        System.out.println("Game #" + this.id);
        System.out.println("Temperature: " + this.temp + "°C");
        System.out.println("Away Team: " + this.getT2() + ", " + this.getGoals2());
        System.out.println("Home Team: " + this.getT1() + ", " + this.getGoals1());
        System.out.println("");
    }
}
