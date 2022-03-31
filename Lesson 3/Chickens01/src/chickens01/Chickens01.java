
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken = 5, chickenCount = 3, totalEggs = 0;
        totalEggs += eggsPerChicken * chickenCount;
        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        
        System.out.println(totalEggs);
        
        eggsPerChicken = 4;
        chickenCount = 8;
        totalEggs = 0;
        totalEggs += eggsPerChicken * chickenCount;
        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
    }   
}
