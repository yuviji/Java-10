package prisontest;

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner(){
        this(null, 0.0, 0);
    }
    public Prisoner(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " + name + "\tHeight: " + height + "m\tSentence: " + sentence + " years");
    }
    public void display(boolean brain){
        display();
        if (brain)
            this.think();
    }
}
