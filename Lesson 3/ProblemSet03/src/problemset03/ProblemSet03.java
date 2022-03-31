/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemset03;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuvraj Lakhotia
 */
public class ProblemSet03 {

    public static void main(String[] args) {
        int number, age, goals, assists, redCard, yellowCard, gp;
        double gpg, apg, ycpg, rcpg, weeklyWage, annualWage;
        boolean retireSoon;
        String fName, lName, name, team;
        
        JOptionPane.showMessageDialog(null, "Welcome to the soccer player summarizer!", "Hello", 0);
        fName = JOptionPane.showInputDialog("What is your first name?");
        lName = JOptionPane.showInputDialog("What is your last name?");
        name = fName + " " + lName;
        JOptionPane.showMessageDialog(null, "Hi there " + name + "!", "Woah!", 0);
        team = JOptionPane.showInputDialog("What team do you play for?");
        number = Integer.parseInt(JOptionPane.showInputDialog("What is your jersey number?"));
        gp = Integer.parseInt(JOptionPane.showInputDialog("How many games did you play this season?"));
        goals = Integer.parseInt(JOptionPane.showInputDialog("How many goals did you score this season?"));
        assists = Integer.parseInt(JOptionPane.showInputDialog("How many assists did you provide this season?"));
        yellowCard = Integer.parseInt(JOptionPane.showInputDialog("How many yellow cards did you receive this season?"));
        redCard = Integer.parseInt(JOptionPane.showInputDialog("How many red cards did you receive this season?"));
        weeklyWage = Double.parseDouble(JOptionPane.showInputDialog("What is your weekly wage, in dollars?"));
        gpg = (goals * 1.0) / gp;
        apg = (assists * 1.0) / gp;
        rcpg = (redCard * 1.0) / gp;
        ycpg = (yellowCard * 1.0) / gp;
        annualWage = weeklyWage * 52;
        String[] acceptable = {"Yes", "No"};
        retireSoon = JOptionPane.showInputDialog(null, "Are you planning to retire soon?", "Retirement", 2, null, acceptable, acceptable[1]).equals("Yes");
        String retirement = (retireSoon ? " be retiring after a successful career with " : " continue playing for ") + team + ".";
        JOptionPane.showMessageDialog(null,"At the conclusion of the " + gp + " games of the 2021-2022 season, " + name + " has announced they will " + retirement);
        JOptionPane.showMessageDialog(null,"This season, they tallied " + goals + " goals and " + assists + " assists.");
        JOptionPane.showMessageDialog(null,"Unfortunately, they also received " + yellowCard + " yellow cards and were ejected " + redCard + " times.");
        JOptionPane.showMessageDialog(null,"However, earning an annual wage of $" + annualWage + ", they are printing cash with their talent.");
        JOptionPane.showMessageDialog(null,"This averages out to " + gpg + " goals/game and " + apg + " assists/game.");
    }
    
}
