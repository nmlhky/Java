package javaClassWithMrDuran.day57File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class productFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("data.txt");
            if (myFile.createNewFile()){
                System.out.println("new file created");
            }
            else {
                System.out.println("file already exis");
            }
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Apple $2\n");
            fw.write("banana $3\n");
            fw.write("Pineapple $5");
            System.out.println("product writed to file");
            fw.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
