import java.util.Scanner;

/**
 * Throw keyword is used to throw the exception manually
 * usually used in Custom Exceptions
 */
public class ThrowKeyword {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            int age = scan.nextInt();
            if(age<=1){
                throw new ArithmeticException("Age should be greater than 1");
            } else{
                System.out.println("Age:"+age);
            }
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
        finally {
            System.out.println("Program Ended");
        }

    }
}
