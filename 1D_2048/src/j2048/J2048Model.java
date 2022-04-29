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
    
    private int getOpen(int[] board){
        // find new open space on board
        Random rand = new Random();
        int a = rand.nextInt(DIM);
        while (board[a] != 0){
            a = rand.nextInt(DIM);
        }
        return a;
    }
    private boolean cellEmpty(int[] board){
        // check if any cell is empty in the board
        for (int i = 0; i < DIM; i++){
            if (board[i] == 0)
                return true;
        }
        return false;
    }
    private int nextLeft(int[] board, int a){
        // find next non-empty cell to left of cell
        for (int i = a - 1; i >= 0; i--){
            if (board[i] != 0)
                return i;
        }
        return -1;
    }
    private int nextRight(int[] board, int a){
        // find next non-empty cell to right of cell
        for (int i = a + 1; i < DIM; i++){
            if (board[i] != 0)
                return i;
        }
        return DIM;
    }
    private void swap(int[] board, int a, int b){
        int temp = board[a];
        board[a] = board[b];
        board[b] = temp;
    }
    
    public boolean equal(int[] a, int[] b){
        for (int i = 0; i < DIM; i++){
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
    public void init(int[] board){
        int a = this.getOpen(board), b = this.getOpen(board);
        while (a == b)
            a = this.getOpen(board);
        board[a] = board[b] = 2;
        for (int i = 0; i < DIM; i++){
            if (i != a && i != b)
                board[i] = 0;
        }
    }
    public void spawn(int[] board){
        Random rand = new Random();
        board[this.getOpen(board)] = (rand.nextInt(10) == 0 ? 4 : 2);
    }
    public char state(int[] board){
        // W = WIN, P = PLAYING, L = LOST
        // win
        for (int i : board){
            if (i == 2048)
                return 'W';
        }
        // still playing
        if (cellEmpty(board))                                                   // any cell empty
            return 'P';
        for (int i = 0; i < DIM - 1; i++){
            if (board[i] == board[i + 1])
                return 'P';
        }
        // lost
        return 'L';
    }
    public void moveLeft(int[] board){
        for (int i = 1; i < DIM; i++){                                          // merge similar cells
            int left = this.nextLeft(board, i);
            if (board[i] != 0 && left != -1 && board[i] == board[left]){
                board[left] *= 2;
                this.score += board[left];
                board[i] = 0;
            }
        }
        for (int i = 1; i < DIM; i++){                                          // shift past empty to right
            if (board[i] != 0){
                int count = i;
                while (count >= 1 && board[count - 1] == 0){
                    this.swap(board, count, count - 1); 
                    count--;
                }
            }
        }
    }
    public void moveRight(int[] board){
        for (int i = DIM - 1; i >= 0; i--){                                     // merge similar cells
            int right = this.nextRight(board, i);
            if (board[i] != 0 && right != DIM && board[i] == board[right]){
                board[right] *= 2;
                this.score += board[right];
                board[i] = 0;
            }
        }
        for (int i = DIM - 1; i >= 0; i--){                                     // shift past empty to left
            if (board[i] != 0){
                int count = i;
                while (count < DIM - 1 && board[count + 1] == 0){
                    this.swap(board,count, count + 1); 
                    count++;
                }
            }
        }
    }
}
