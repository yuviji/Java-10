
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 4.20;
        int quantity = 69;
        double tax = 0.07;        
        
        // Declare and assign a calculated totalPrice
        double totalPrice = (price * quantity) * (1 + tax);
        
        // Modify message to include quantity 
        System.out.println(custName+" wants to purchase " + quantity + " " +itemDesc);

        // Print another message with the total cost
        System.out.println("Total cost with tax is: $" + totalPrice);
    }    
}
