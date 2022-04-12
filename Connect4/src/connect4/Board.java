package connect4;

public class Board {

    private Column[] board;                                 // 7 columns, 6 rows

    public Board() {
        board = new Column[7];
        for (int i = 0; i < 7; i++) {
            board[i] = new Column();
        }
    }

    public boolean insert(Player player, int column) {
        // insert coin from a certain player into a valid column
        if (column >= 1 && column <= 7) {
            if (board[column - 1].insert(player.place(column))) {
                return true;
            } 
            else {
                System.out.println("This column is full! Try another column.");
                return false;
            }
        } 
        else {
            System.out.println("Invalid column! Can't insert.");
            return false;
        }
    }

    public String winner() {
        // vertical check
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                String temp = board[i].display(j);
                if (!temp.equals(" ")
                        && temp.equals(board[i].display(j + 1))
                        && temp.equals(board[i].display(j + 2))
                        && temp.equals(board[i].display(j + 3))) {
                    return temp;
                }
            }
        }
        // horizontal check
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                String temp = board[i].display(j);
                if (!temp.equals(" ")
                        && temp.equals(board[i + 1].display(j))
                        && temp.equals(board[i + 2].display(j))
                        && temp.equals(board[i + 3].display(j))) {
                    return temp;
                }
            }
        }
        // ascending diagonal check
        for (int i = 3; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                String temp = board[i].display(j);
                if (!temp.equals(" ")
                        && temp.equals(board[i - 1].display(j + 1))
                        && temp.equals(board[i - 2].display(j + 2))
                        && temp.equals(board[i - 3].display(j + 3))) {
                    return temp;
                }
            }
        }
        // descending diagonal check
        for (int i = 3; i < 7; i++) {
            for (int j = 3; j < 6; j++) {
                String temp = board[i].display(j);
                if (!temp.equals(" ")
                        && temp.equals(board[i - 1].display(j - 1))
                        && temp.equals(board[i - 2].display(j - 2))
                        && temp.equals(board[i - 3].display(j - 3))) {
                    return temp;
                }
            }
        }
        return " ";
    }

    public void display() {
        // print the board
        System.out.println("\n");
        System.out.println("- ".repeat(board.length + 2));
        for (int i = 0; i < 6; i++) {
            String line = "| ";
            for (int j = 0; j < 7; j++) {
                line += (board[j].display(i) + " ");
            }
            line += "|";
            System.out.println(line);
        }
        System.out.println("- ".repeat(board.length + 2));
    }
}
