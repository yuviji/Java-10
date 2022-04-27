package j2048;
import java.util.*;

public class J2048Model {
    private int score;
    private int DIM;
    
    public J2048Model(int DIM){
        this.DIM = DIM;
        this.score = 0;
    }
    public J2048Model(){
        this(4);
    }
    
    public int getScore(){
        return this.score;
    }
    
    private J2048Pair getOpen(int[][] board){
        // find new open space on board
        Random rand = new Random();
        int a = rand.nextInt(DIM), b = rand.nextInt(DIM);
        while (board[a][b] != 0){
            a = rand.nextInt(DIM);
            b = rand.nextInt(DIM);
        }
        return new J2048Pair(a, b);
    }
    private boolean cellEmpty(int[][] board){
        // check if any cell is empty in the board
        for (int i = 0; i < DIM; i++){
            for (int j = 0; j < DIM; j++){
                if (board[i][j] == 0)
                    return true;
            }
        }
        return false;
    }
    private int nextLeft(int[][] board, int a, int b){
        // find next non-empty cell to left of cell
        for (int i = b - 1; i >= 0; i--){
            if (board[a][i] != 0)
                return i;
        }
        return -1;
    }
    private int nextRight(int[][] board, int a, int b){
        // find next non-empty cell to right of cell
        for (int i = b + 1; i < DIM; i++){
            if (board[a][i] != 0)
                return i;
        }
        return -1;
    }
    private int nextUp(int[][] board, int a, int b){
        // find next non-empty cell above cell
        for (int i = a - 1; i >= 0; i--){
            if (board[i][b] != 0)
                return i;
        }
        return -1;
    }
    private int nextDown(int[][] board, int a, int b){
        // find next non-empty cell below cell
        for (int i = a + 1; i < DIM; i++){
            if (board[i][b] != 0)
                return i;
        }
        return -1;
    }
    private void swap(int[][] board, int a1, int a2, int b1, int b2){
        // swap 2 tiles on the board
        int temp = board[a1][a2];
        board[a1][a2] = board[b1][b2];
        board[b1][b2] = temp;
    }
    
    public void init(int[][] board){
        // initialize board with 2 randomly placed 2's
        J2048Pair a = this.getOpen(board), b = this.getOpen(board);
        while (a.equals(b))
            a = this.getOpen(board);
        board[a.first][a.second] = board[b.first][b.second] = 2;
        for (int i = 0; i < DIM; i++){
            for (int j = 0; j < DIM; j++){
                J2048Pair temp = new J2048Pair(i, j);
                if (!temp.equals(a) && !temp.equals(b))
                    board[i][j] = 0;
            }
        }
    }
    public void spawn(int[][] board){
        // find location to place new tile
        Random rand = new Random();
        J2048Pair loc = this.getOpen(board);
        board[loc.first][loc.second] = (rand.nextInt(10) == 0 ? 4 : 2);
    }
    public char state(int[][] board){
        // W = WIN, P = PLAYING, L = LOST
        // win
        for (int[] i : board){
            for (int j : i){
                if (j == 2048)
                    return 'W';
            }
        }
        // still playing
        if (cellEmpty(board))                                                   // any cell empty
            return 'P';
        for (int i = 0; i < DIM - 1; i++){                                      // check any 2 similar adjacent cells
            if (board[i][DIM - 1] == board[i + 1][DIM - 1])                     // check outermost column
                return 'P';
            if (board[DIM - 1][i] == board[DIM - 1][i + 1])                     // check outermost row
                return 'P';
            for (int j = 0; j < DIM - 1; j++){                                  // check all inner rows & columns
                if (board[i][j] == board[i + 1][j]                              
                    || board[i][j] == board[i][j + 1])
                    return 'P';
            }
        }
        // lost
        return 'L';
    }
    public void moveLeft(int[][] board){
        for (int i = 0; i < DIM; i++){                                          // merge similar cells
            for (int j = 1; j < DIM; j++){                                          
                int left = this.nextLeft(board, i, j);
                if (board[i][j] != 0 && left != -1 && board[i][j] == board[i][left]){
                    board[i][left] *= 2;
                    this.score += board[i][left];
                    board[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < DIM; i++){                                          // shift past empty
            for (int j = 1; j < DIM; j++){                                          
                if (board[i][j] != 0){
                    int count = j;
                    while (count >= 1 && board[i][count - 1] == 0){
                        this.swap(board, i, count, i, count - 1); 
                        count--;
                    }
                }
            }
        }
    }
    public void moveRight(int[][] board){
        for (int i = 0; i < DIM; i++){                                          // merge similar cells
            for (int j = DIM - 1; j >= 0; j--){                                          
                int right = this.nextRight(board, i, j);
                if (board[i][j] != 0 && right != -1 && board[i][j] == board[i][right]){
                    board[i][right] *= 2;
                    this.score += board[i][right];
                    board[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < DIM; i++){                                          // shift past empty
            for (int j = DIM - 1; j >= 0; j--){                                          
                if (board[i][j] != 0){
                    int count = j;
                    while (count < DIM - 1 && board[i][count + 1] == 0){
                        this.swap(board, i, count, i, count + 1); 
                        count++;
                    }
                }
            }
        }
    }
    public void moveUp(int[][] board){
        for (int i = 1; i < DIM; i++){                                          // merge similar cells
            for (int j = 0; j < DIM; j++){
                int up = this.nextUp(board, i, j);
                if (board[i][j] != 0 && up != -1 && board[i][j] == board[up][j]){
                    board[up][j] *= 2;
                    this.score += board[up][j];
                    board[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < DIM; i++){                                          // shift past empty cells
            for (int j = 0; j < DIM; j++){
                if (board[i][j] != 0){
                    int count = i;
                    while (count >= 1 && board[count - 1][j] == 0){
                        this.swap(board, count, j, count - 1, j);
                        count--;
                    }
                }
            }
        }
    }
    public void moveDown(int[][] board){
        for (int i = DIM - 1; i >= 0; i--){                                     // merge similar cells
            for (int j = 0; j < DIM; j++){
                int down = this.nextDown(board, i, j);
                if (board[i][j] != 0 && down != -1 && board[i][j] == board[down][j]){
                    board[down][j] *= 2;
                    this.score += board[down][j];
                    board[i][j] = 0;
                }
            }
        }
        for (int i = DIM - 1; i >= 0; i--){                                     // shift past empty cells
            for (int j = 0; j < DIM; j++){
                if (board[i][j] != 0){
                    int count = i;
                    while (count < DIM - 1 && board[count + 1][j] == 0){
                        this.swap(board, count, j, count + 1, j);
                        count++;
                    }
                }
            }
        }
    }
}
