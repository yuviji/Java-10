/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountingtest;

/**
 *
 * @author Yuvi
 */
public class CheckingAccount {
    public double balance = 0.00;
    public String name;
    
    public void withdraw(double amt){
        if (amt < 0){
            System.out.println("Can not withdraw negative amount of money");
        }
        else if (amt > balance){
            System.out.println(name + " account balance too low to withdraw $" + amt);
        }
        else{
            balance -= amt;
            System.out.println("Withdrew $" + amt + ". New balance: $" + balance);
        }
    }
}
