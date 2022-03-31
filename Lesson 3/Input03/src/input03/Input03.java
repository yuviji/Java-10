package input03;
import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scan = new Scanner(System.in);
        
        //Find and print the sum of three integers entered by the user
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        System.out.println(a + b + c);   
        
        //Remember to close the Scanner
        scan.close();
    }
}
