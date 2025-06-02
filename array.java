import java.util.Scanner;

/**
 * Arrays in Java are one of the most fundamental data structures that allow us to store multiple
 * values of the same type in a single variable.
 * They are useful for storing and managing collections of data.
 */
public class array {

    public static void main(String[] args) {
        
        System.out.println("Array1");
        String[] songNames = new String[5];
        songNames[0] = "Song1";
        songNames[1] = "Song2";
        songNames[2] = "Song3";
        songNames[3] = "Song4";
        songNames[4] = "Song5";

        for (String string : songNames) {
            System.out.println(string);
        }

        System.out.println("Array2");
        String[] songNames1 = {"Song1","Song2","Song3","Song4","Song5"};
        for (String string : songNames1) {
            System.out.println(string);
        }


        int[] score = new int[5];
        Scanner scan = new Scanner(System.in);
        score[0] = scan.nextInt();
        score[1] = scan.nextInt();
        score[2] = scan.nextInt();
        score[3] = scan.nextInt();
        score[4] = scan.nextInt();

        int total = score[0]+score[1]+score[2]+score[3]+score[4];
        System.out.println("Total:" + total);
        scan.close();

    }
    
}
