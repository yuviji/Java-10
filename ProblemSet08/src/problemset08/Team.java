package problemset08;

public class Team {
    private static int numTeams = 1;
    private String name;
    private int win, loss, draw, scored, allowed;
    
    public Team(String name){
        this.name = name;
        this.win = this.loss = this.draw = this.scored = this.allowed = 0;
        Team.numTeams++;
    }
    public Team(){
        this(("Team " + numTeams));
    }
    
    public String getName(){
        return this.name;
    }
    public int getWin(){
        return this.win;
    }
    public int getLoss(){
        return this.loss;
    }
    public int getDraw(){
        return this.draw;
    }
    public int getScored(){
        return this.scored;
    }
    public int getAllowed(){
        return this.allowed;
    }
    
    public void score(int goals){
        this.scored += goals;
    }
    public void concede(int goals){
        this.allowed += goals;
    }    
    public void win(){
        this.win++;
    }
    public void lose(){
        this.loss++;
    }
    public void draw(){
        this.draw++;
    }
    
    public void display(){
        System.out.println(this.getName());
        System.out.println("Wins: " + this.getWin() + " | Losses: " + this.getLoss() + " | Draws: " + this.getDraw());
        System.out.println("Scored: " + this.getScored() + " | Conceded: " + this.getAllowed());
        System.out.println("");
    }
}
