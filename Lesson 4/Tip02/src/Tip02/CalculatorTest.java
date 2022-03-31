
package Tip02;

public class CalculatorTest {
    public static void main(String[] args) { 
        //Instantiate a Calculator object
        Calculator calc = new Calculator();
        
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party
        calc.originalPrice = 10;
        System.out.print("person1: $");
        calc.findTotal();
        calc.originalPrice = 12;
        System.out.print("person2: $");
        calc.findTotal();
        calc.originalPrice = 9;
        System.out.print("person3: $");
        calc.findTotal();
        calc.originalPrice = 8;
        System.out.print("person4: $");
        calc.findTotal();
        calc.originalPrice = 7;
        System.out.print("person5: $");
        calc.findTotal();
        calc.originalPrice = 15;
        System.out.print("person6: $");
        calc.findTotal();
        calc.originalPrice = 11;
        System.out.print("person7: $");
        calc.findTotal();
        calc.originalPrice = 30;
        System.out.print("person8: $");
        calc.findTotal();
    }
}
