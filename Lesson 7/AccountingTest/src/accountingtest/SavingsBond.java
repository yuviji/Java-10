/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountingtest;

/**
 *
 * @author Yuvi
 */
public class SavingsBond {
    public String name;
    public double balance, interest;
    public int term, remaining;
    
    public void setTermInterest(int t){
        if (t >= 0 && t <= 11)
            interest = 0.5;
        else if (t >= 12 && t <= 23)
            interest = 1;
        else if (t >= 24 && t <= 35)
            interest = 1.5;
        else if (t >= 36 && t <= 47)
            interest = 2;
        else if (t >= 48 && t <= 60)
            interest = 2.5;
        else{
            System.out.println("Invalid Term");
            t = 0;
        }
        interest /= 100;
        term = remaining = t;
    }
    public void earnInterest(){
        if (remaining > 0){
            balance += balance * (interest / 12);
            remaining--;
            System.out.println("Balance: $" + balance);
            System.out.println("Rate: " + (interest * 100) + "%");
            System.out.println("Months remaining: " + remaining);
        }
        else{
            System.out.println("Bond matured.");
        }
    }
}
