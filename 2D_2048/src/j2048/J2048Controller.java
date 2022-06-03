package j2048;
import java.util.*;

public class J2048Controller {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // setup
        System.out.print("Enter board DIM (2 - 10): ");
        int DIM = Math.min(Math.max(scan.nextInt(), 2), 10);
        int[][] board = new int[DIM][DIM];
        J2048Model model = new J2048Model(DIM);
        J2048View view = new J2048View();
        
        boolean quit = false;
        model.init(board);
        while(!quit && model.state(board) == 'P'){
            // gameplay
            view.printScore(model.getScore());
            view.draw(board);
            int[][] prev = new int[DIM][DIM];
            for (int i = 0; i < DIM; i++){
                for (int j = 0; j < DIM; j++)
                    prev[i][j] = board[i][j];
                
            System.out.print("Move: ");
            char move = Character.toLowerCase(scan.next().charAt(0));
            switch(move){
                case 'q':
                    quit = true;
                    break;
                case 'w':
                    model.moveUp(board);
                    break;
                case 'a':
                    model.moveLeft(board);
                    break;
                case 's':
                    model.moveDown(board);
                    break;
                case 'd':
                    model.moveRight(board);
                    break;
                default:
                    System.out.println("Please enter a valid input.");
            }
            if (!model.equal(prev, board))
                model.spawn(board);
            }
            // game over
            view.printScore(model.getScore());
            view.draw(board);
            System.out.println(model.state(board) == 'W' ? "You Won!" : "Game Over!");
        }
    }
}