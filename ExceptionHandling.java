import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try {
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();

            System.out.println("Valid Input : " + number1 + " , " + number2);
            int result = number1/number2;
            System.out.println("Result : " + result);
        }
        catch (ArithmeticException ex ){
            System.out.println("ArithmeticException : "+ ex);
        }
        catch (InputMismatchException ex ){
            System.out.println("Invalid Input");
            System.out.println("InputMismatchException : "+ ex);
        }
        catch (Exception ex){
            System.out.println("Error:"+ex);
        }
        finally {
            System.out.println("Program Ended");
            scan.close();
        }
    }
}
