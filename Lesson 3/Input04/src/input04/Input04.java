package input04;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("Level05.txt"));      
        String a = "", b = "";
        
        //Edit these lines to advance the scanner
        while(sc.findInLine("BlueBumper") == null){
            a = sc.nextLine();
        }
        
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        System.out.println("X: " + x +", Y: " + y);
    }    
}
