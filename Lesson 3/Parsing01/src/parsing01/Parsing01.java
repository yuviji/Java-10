package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "4.20", taxRate = "0.069", gibberish = "jfdksjf";
        
        //Parse shirtPrice and taxRate, and print the total tax
        double price = Double.parseDouble(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        System.out.println(price * tax);
        
        //Try to parse taxRate as an int
        int iTax = Integer.parseInt(taxRate);
                
        //Try to parse gibberish as an int
        int iGib = Integer.parseInt(gibberish);
        
    }
    
}
