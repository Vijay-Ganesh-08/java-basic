package FileHandling;

import java.io.BufferedWriter;
import java.io.IOException;
/**
 * FileWriter - Writes each character to the file.
 * BufferedWriter - Writes each line to the file.
 * The Second parameter is optional and can be used if file needs to be appended
 */
public class FileWriting {

    public static void main(String[] args){
        try{
            java.io.FileWriter fw = new java.io.FileWriter("output.txt",false);
            fw.write("Hello World");
            fw.append("\nWriting File with FileWriter");
            fw.close();
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Something Went Wrong");
        }

        try {
            java.io.FileWriter fw = new java.io.FileWriter("output1.txt",false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello World");
            bw.append("\nWriting File with BufferedWriter");
            bw.close();
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Something Went Wrong");
        }
    }
}
