package javaClassWithMrDuran.projects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hangman {
    ArrayList<String> words = new ArrayList<>(List.of("cucumber","internet","programing","selenium","java","html"));
    String word = words.get((int)(Math.random()*words.size()));
    HashSet<Character> knownLetter = new HashSet<>();
    int fail = 0;

    public void addWord(String str){
        this.words.add(str);
    }

    public void displayWord(){
        for (int i = 0; i < word.length(); i++) {
            if (knownLetter.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }
            else {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
    public void drawMen(){
        System.out.println();
        System.out.println("   o   ");
        System.out.println("   /|\\    ");
        System.out.println("  _/\\__   ");


    }

}
