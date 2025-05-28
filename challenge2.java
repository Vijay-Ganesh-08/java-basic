import java.util.Scanner;

class challenge2{
    public static void main(String[] args) {
        
        //Q1
        // If .. else if 
        int marks = 100;

        if (marks < 40){
            System.out.println("Student Failed");
        } else if (marks >= 40 && marks < 60){
            System.out.println("Student Passed with Second Class");

        } else if (marks >= 60 && marks <80){
            System.out.println("Student Passed with First Class");
        } else {
            System.out.println("Student Passed with Distinction");

        }


        //Q2
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        int salary = scan.nextInt();
        
        if(salary > 7000)
        {
            System.out.println("Available");
        } else {
            System.out.println("UnAvailable");
        }
        
        
        //Q3
        System.out.print("Enter Number : ");
        int num = scan.nextInt();
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by 3 and 5");
        } else if (num % 3 == 0 && num % 5 != 0){
            System.out.println("Divisible only by 3");
        } else if (num % 3 != 0 && num % 5 == 0){
            System.out.println("Divisible only 5");
        }
        
        scan.close();




    }
}