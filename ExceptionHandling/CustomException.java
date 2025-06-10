package ExceptionHandling;

import java.util.Scanner;

/**
 * Class that extend Exception class is called Custom Exception
 * Its user-defined Exception which should get a message as input and pass it to Super Class
 * Compile Time Exceptions are called Checked-Exceptions (Ex: Type Casting)
 * Run Time Exceptions are called UnChecked-Exceptions (Ex: Divide by Zero)
 */

/**
 * Throws Keyword is used in the function/method to let the compiler knows that it has possibility for Exception
 * The Calling method should handle the Exceptions which is used in THROWS keyword
 */
class InvalidAgeException extends Exception{

    InvalidAgeException(String message){
        super(message);
    }
}

class AgeValidator {
    void checkAge(int age) throws InvalidAgeException {
        if (age<=0 || age > 150){
            throw new InvalidAgeException("Age Cannot be less than 0 or Greater than 150");
        } else {
            System.out.println("Valid Age : " + age);
        }
    }
}

public class CustomException {

    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        AgeValidator ageValidator = new AgeValidator();
        try {
            System.out.print("Enter the Age : ");
            int age = scan.nextInt();
            ageValidator.checkAge(age);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
