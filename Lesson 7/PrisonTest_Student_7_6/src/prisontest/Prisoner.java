package prisontest;

public class Prisoner {
    private static int prisonerCount = 0;

    //Fields
    private String name;
    private double height;
    private int sentence;
    private int bookingNumber;
    private Cell cell;
    
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell cell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
        this.cell = cell;
        this.bookingNumber = ++prisonerCount;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Prisoner Count: " +prisonerCount);
        System.out.println("Name: " +getName());
        System.out.println("Booking Number: " +getBookingNumber());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " +getCell().getName());
    }
    
    //Getters
    public static int getPrisonerCount(){
        return prisonerCount;
    }
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public Cell getCell() {
        return cell;
    }
    public int getBookingNumber(){
        return bookingNumber;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
