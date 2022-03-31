
package tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        double extra = 1.2;
        double p1 = 10, p2 = 12, p3 = 9, p4 = 8, p5 = 7, p6 = 15, p7 = 11, p8 = 30;
        System.out.println("person1: $" + (p1 * extra));
        System.out.println("person2: $" + (p2 * extra));
        System.out.println("person3: $" + (p3 * extra));
        System.out.println("person4: $" + (p4 * extra));
        System.out.println("person5: $" + (p5 * extra));
        System.out.println("person6: $" + (p6 * extra));
        System.out.println("person7: $" + (p7 * extra));
        System.out.println("person8: $" + (p8 * extra));
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}
