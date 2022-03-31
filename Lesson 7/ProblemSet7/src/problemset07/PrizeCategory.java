package problemset07;

public class PrizeCategory {
    //Fields
    private final String name;
    private final int ticketsRequired;
    private int itemCount;
    
    //Constructor
    public PrizeCategory(String name, int ticketsRequired, int itemCount){
        this.name = name;
        this.ticketsRequired = ticketsRequired;
        this.itemCount = itemCount;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    public int getTicketsRequired(){
        return ticketsRequired;
    }
    public int getItemCount(){
        return itemCount;
    }
    //Setters
    public void setItemCount(int itemCount){
        this.itemCount = itemCount;
    }
}
