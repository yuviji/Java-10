package connect4;

public class Column {

    private int lastPush;
    private Coin coins[];
    
    public Column() {
        coins = new Coin[6];
        lastPush = 6;
    }

    public boolean insert(Coin coin) {
        // if there is space in the column, push a coin in
        if (lastPush > 0){
            coins[--lastPush] = coin;
            return true;
        }
        return false;
    }
    
    public String display(int row) {
        // return the coin in a cell if placed, else a blank space
        if (lastPush > row) {
            return " ";
        } 
        else {
            return coins[row].display();
        }
    }
}
