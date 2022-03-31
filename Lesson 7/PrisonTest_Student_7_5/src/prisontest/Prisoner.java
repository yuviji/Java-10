package prisontest;

public class Prisoner {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell jail;
    
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell jail){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
        this.jail = jail;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell: " +jail.getName());
    }
    public String getName(){
        return this.name;
    }
    public double getHeight(){
        return this.height;
    }
    public int getSentence(){
        return this.sentence;
    }
    public Cell getCell(){
        return this.jail;
    }
    public void display(boolean b){
        this.display();
        if (b)
            this.think();
    }
    
}
