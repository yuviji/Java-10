package loopshape;
import java.util.Scanner;

public class LoopShapeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rw, rl, leg;
        System.out.print("Enter rectangle width: ");
        rw = scan.nextInt();
        while (rw < 1){
            System.out.println("Enter a value greater than or equal to 1");
            System.out.print("Enter rectangle width: ");
            rw = scan.nextInt();
        }
        System.out.print("Enter rectangle length: ");
        rl = scan.nextInt();
        while (rl < 1){
            System.out.println("Enter a value greater than or equal to 1");
            System.out.print("Enter rectangle length: ");
            rl = scan.nextInt();
        }
        LoopShape.createRectangle(rw, rl);
        System.out.print("Enter triangle leg: ");
        leg = scan.nextInt();
        while (leg < 1){
            System.out.println("Enter a value greater than or equal to 1");
            System.out.print("Enter rectangle width: ");
            leg = scan.nextInt();
        }
        LoopShape.createTriangle(leg);
    }   
}
