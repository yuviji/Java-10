/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisontest;

/**
 *
 * @author Yuvi
 */
public class Cell {
    private String name;
    private boolean isOpen;
    private int code;
    
    public Cell(String name, boolean isOpen, int code){
        this.name = name;
        this.isOpen = isOpen;
        this.code = code;
    }
    public String getName(){
        return this.name;
    }
    public boolean getOpen(){
        return this.isOpen;
    }
    public void openDoor(int pass){
        if (pass == this.code){
            this.isOpen = !this.isOpen;
            System.out.println("Door is " + (this.isOpen ? "open" : "closed") + ".");
        }
        else{
            System.out.println("Incorrect security code!");
        }
    }
}
