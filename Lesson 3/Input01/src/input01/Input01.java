package input01;
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String in = JOptionPane.showInputDialog("Enter an integer:");
                
        //Parse the input as an int.
        //Print its value +1
        System.out.println(Integer.parseInt(in) + 1);
                
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:")));
        
    }
}
