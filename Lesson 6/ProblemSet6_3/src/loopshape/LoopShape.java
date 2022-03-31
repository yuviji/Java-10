package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if (i > 0 && i < height - 1 && j > 0 && j < width - 1   )
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.print("\n");
        }
    }
    
    static void createTriangle(int leg){
        for (int i = 0; i < leg; i++){
            if (i == 0){
                System.out.print("#");
            }
            else if (i == leg - 1){
                for (int j = 0; j < leg; j++){
                    System.out.print("#");
                }
            }
            else{
                System.out.print("#");
                for (int j = 0; j < i - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            System.out.print("\n");       
        }
    }
}
