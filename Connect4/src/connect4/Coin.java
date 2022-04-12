package connect4;

public class Coin {                                     // CLASSES

    private final String sign;

    public Coin(Player player) {                        // CUSTOM CONSTRUCTOR
        sign = Character.toString(player.getNumber() + 64);
    }

    public String display() {                           // GETTER METHOD
        return sign;
    }
}
