/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processingname;

import java.util.Scanner;

public class ProcessName {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, fName, lName;
        System.out.print("Type your name: ");
        name = scan.nextLine();
        fName = name.substring(0, name.indexOf(" "));
        lName = name.substring(name.lastIndexOf(" "));
        System.out.println("Your name is: " + lName + ", " + fName.substring(0, 1) + ".");       
    }
}