/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemset07;

/**
 *
 * @author Yuvi
 */
public class Prize {
    private final String name;
    private final int price;
    private int stock;
    
    public Prize(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getStock(){
        return this.stock;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
}
