package j2048;

public class J2048View {
    
    public void printScore(int score){
        System.out.println("Score: " + score);
    }
    public void draw(int[] board){
        for (int i : board){
            if (i == 0)
                System.out.print(String.format("%4c", '-'));
            else
                System.out.print(String.format("%4d", i));
        }
        System.out.println("");
    }
}
