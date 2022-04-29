package problemset08;
import java.util.*;

public class Scheduler {
    private ArrayList<Game> games;
    private final Team[] teams;
    private int tempSum, hottest;
    
    public Scheduler(String[] teams){
        this.teams = new Team[teams.length];
        for (int i = 0; i < teams.length; i++)
            this.teams[i] = new Team(teams[i]);
        this.tempSum = 0;
        this.games = new ArrayList<Game>();
    }
    
    public int getHottest(){
        return this.hottest;
    }
    public double getAvgTemp(){
        System.out.println(this.tempSum);
        System.out.println(this.teams.length);
        System.out.println((double)(this.teams.length));
        System.out.println(this.tempSum / this.teams.length);
        return this.tempSum / ((double)(this.teams.length));
    }
    
    public void schedule(int temperature){
        Random rand = new Random();
        int[] matchups = new int[this.teams.length];
        for (int i = 0; i < matchups.length; i++)
            matchups[i] = i;
        for (int i = matchups.length - 1; i > 0; i--){
            int j = rand.nextInt(i + 1);
            int temp = matchups[i];
            matchups[i] = matchups[j];
            matchups[j] = temp;
        }
        for (int i = 0; i < matchups.length; i += 2){
            Team a = this.teams[matchups[i]], b = this.teams[matchups[i + 1]];
            Game game = new Game(a, b, temperature);
            int result = game.play();
            switch (result) {
                case 0:
                    a.draw();
                    b.draw();
                    break;
                case 1:
                    a.win();
                    b.lose();
                    break;
                case 2:
                    a.lose();
                    b.win();
                    break;
            }
            this.games.add(game);                                               
        }
        this.hottest = Math.max(this.hottest, temperature);
        this.tempSum += temperature;
    }
    
    public void display(){
        for (Team t : this.teams)
            t.display();
        for (Game g : this.games)
            g.display();
    }
}
