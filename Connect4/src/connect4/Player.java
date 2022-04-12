package connect4;

public class Player {

    private static int players = 0;                         // STATIC MEMBERS
    private final int number;                               // ACCESS MODIFIERS
    private final String name;
    private Coin coins[];
    private int coinsLeft;

    public Player(String name) {
        this.number = ++players;
        coins = new Coin[21];
        for (int i = 0; i < 21; i++) {
            coins[i] = new Coin(this);
        }
        coinsLeft = 21;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getCoins() {
        return coinsLeft;
    }

    public Coin place(int column) {
        return coins[--coinsLeft];
    }

}
