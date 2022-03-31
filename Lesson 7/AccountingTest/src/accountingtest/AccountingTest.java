/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountingtest;
/**
 *
 * @author Yuvraj
 */
public class AccountingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.name = "Joe";
        account.balance = 69420.99;
        account.withdraw(-200);
        account.withdraw(100000);
        account.withdraw(2000);
        
        SavingsBond bond = new SavingsBond();
        bond.balance = 69420.99;
        int term = 11;
        bond.setTermInterest(term);
        for (int i = 1; i <= term; i++){
            bond.earnInterest();
        }
    }
    
}
