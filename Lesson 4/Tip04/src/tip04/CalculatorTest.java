
package tip04;

public class CalculatorTest {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        
        //Name your friends
        double a = calc.findTotal(10, null);
        double b = calc.findTotal(12, null);
        double c = calc.findTotal(9,  null);
        double d = calc.findTotal(8,  null);
        double e = calc.findTotal(7,  null);
        double f = calc.findTotal(15, "Alex");
        double g = calc.findTotal(11, null);
        double h = calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
        double total = a + b + c + d + e + f + g + h;
        System.out.println("Total: $" + total);
        System.out.println("Per person: $" + (total / 6));
    } 
}
