import java.util.Scanner;

public class MethodOverloading {

    int sum (int a, int b){
        return a+b;
    }

    int sum (int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type 2/3:");
        int select = scan.nextInt();

        MethodOverloading obj = new MethodOverloading();

        int a, b, c = 0;
        if (select==2){
            System.out.println("Enter Num 1:");
            a = scan.nextInt();
            System.out.println("Enter Num 2:");
            b = scan.nextInt();
            int sum = obj.sum(a,b);
            System.out.println("sum : " + sum);
        } else if (select==3){
            System.out.println("Enter Num 1:");
            a = scan.nextInt();
            System.out.println("Enter Num 2:");
            b = scan.nextInt();
            System.out.println("Enter Num 3:");
            c = scan.nextInt();
            int sum = obj.sum(a,b,c);
            System.out.println("sum : " + sum);
        } else {
            System.out.println("Invalid Input, Kindly enter 2/3");
        }
    }
}
