import java.lang.System;
import java.util.Scanner;

public class readinput {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Input 1:");
        int a = scan.nextInt();
        System.out.print("Enter the Input 2:");
        int b = scan.nextInt();
        System.out.println("Addition:" + (a+b));
        scan.close();
    }
}
