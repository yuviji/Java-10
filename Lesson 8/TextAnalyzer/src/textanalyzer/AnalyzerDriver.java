package textanalyzer;

import java.io.*;
import java.util.*;

public class AnalyzerDriver {

    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<Word>();
        ArrayList<Word> results = new ArrayList<Word>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Text Analyzer!");
        System.out.println("Which file would you like to analyze?\n1) 2016 State of the Union address\n2) Loops\n3) Objects");
        int choice = scan.nextInt();
        String file = "no file selected";
        switch(choice){
            case 1:
                file = "sotu2016";
                break;
            case 2:
                file = "loops";
                break;
            case 3:
                file = "objects";
                break;
        }
        System.out.print("What is the minimum size word to return? ");
        int n = scan.nextInt();
        Analyzer analysis = new Analyzer();
        load(file, words);
        results = analysis.analyze(words, n);
        System.out.println("Analyzing " + file);
        System.out.println("----------------------");
        for (Word w : results) {
            System.out.println(w.getValue() + " " + w.getCount());
        }
        scan.close();
    }

    // Loads words from a text file into words ArrayList.
    // Strips out all punctuation.
    public static void load(String file, ArrayList<Word> words) {
        Scanner in;
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        try {
            in = new Scanner(new File(file + ".txt"));
            while (in.hasNext()) {
                String s = (in.next());
                if (!abc.contains(s.substring(s.length() - 1))) {
                    s = s.substring(0, s.length() - 1);
                }
                words.add(new Word(s.toLowerCase()));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
