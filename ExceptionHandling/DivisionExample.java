package ExceptionHandling;

import java.util.Scanner;

public class DivisionExample {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter Numerator : ");
            int numerator= scan.nextInt();
            System.out.println("Enter Denominator : ");
            int denominator = scan.nextInt();
            if (denominator==0){
                throw new ArithmeticException("Cannot divide by zero");
            } else {
                int result = numerator/denominator;
                System.out.println("Result :"+ result);
            }
        } catch (ArithmeticException ex){
            System.out.println(ex);
        } finally {
            scan.close();
        }
    }
}
