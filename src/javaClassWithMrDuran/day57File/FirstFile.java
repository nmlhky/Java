package javaClassWithMrDuran.day57File;

import java.io.File;

public class FirstFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("Melih.txt");
            if (myFile.createNewFile()){
                System.out.println("new file created");
            }
            else {
                System.out.println("file already exis");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
