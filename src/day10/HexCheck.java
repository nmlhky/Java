package day10;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HexCheck {
    public static void main(String[] args) {
        String i = "5677AB88";

        if (i.contains("A") || i.contains("B") ||i.contains("C") ||i.contains("D") ||i.contains("E") ||i.contains("F") ){
            System.out.println("hex");
        }else {
            System.out.println("not hex");
        }
    }
}
