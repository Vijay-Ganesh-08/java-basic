import java.util.Scanner;

public class challenge4 {

    //Q1: To Find whether the Number is Odd/Ever
    void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even Number : " + num);
        } else {
            System.out.println("Odd Number : " + num);
        }
    }

    //Q2: To Find whether the Number is Odd/Ever
    String passOrFail(int mark){
        if (mark >= 40)
        {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        //Q1: To Find whether the Number is Odd/Ever
        System.out.println("Enter the Number : ");
        int num = scan.nextInt();
        challenge4 obj1 = new challenge4();
        obj1.evenOrOdd(num);

        //Q2: To Find whether the Number is Odd/Ever
        challenge4 obj2 = new challenge4();
        System.out.println("Enter the Mark:");
        int marks = scan.nextInt();
        String result = obj2.passOrFail(marks);
        System.out.println(result);
    }
}