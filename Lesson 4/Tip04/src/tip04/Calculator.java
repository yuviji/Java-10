
package tip04;

public class Calculator {
    public double tax = .05;
    public double tip = .15;
    
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public double findTotal(double price, String name){
        return price*(1+tax+tip);
    }
}
