import java.util.Scanner;

/**
 * Programs can choose which part of the code to execute based on some condition.
 * This ability is called decision making and the statements used for it are called conditional statements.
 * These statements evaluate one or more conditions and make the decision whether to execute a block of code or not.
 */
public class ifelse {
    
    public static void main(String[] args) {
       
        // If .. else
        boolean rain = true;

        if(rain){
            System.out.println("Take an Umbrella");
        } else {
            System.out.println("Enjoy the Sunlight");
        }

        // If .. else if 
        int marks = 30;

        if (marks < 40){
            System.out.println("Student Failed");
        } else if (marks >= 40 && marks < 60){
            System.out.println("Student Passed with Second Class");

        } else if (marks >= 60 && marks <80){
            System.out.println("Student Passed with First Class");
        } else {
            System.out.println("Student Passed with Distinction");

        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Num 1 : ");
        int num1 = scan.nextInt();
        System.out.println("Enter Num 2 : ");
        int num2 = scan.nextInt();

        if (num1==num2){
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
        scan.close();
    }
}
