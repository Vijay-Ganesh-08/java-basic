import java.util.Scanner;

public class challenge1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Q1
        // String name = scan.nextLine();
        // int age = scan.nextInt();
        // System.out.println("My Name is : " + name);
        // System.out.println("My Age is : " + age);
        
        //Q2
        // String name = scan.nextLine();
        // int age = scan.nextInt();
        // scan.nextLine();
        // String address = scan.nextLine();
        // System.out.println("My Name is : " + name);
        // System.out.println("My Age is : " + age);
        // System.out.println("My Address is : " + address);
        
        //Q3
        // int a = scan.nextInt();
        // int b = scan.nextInt();
        // int c = scan.nextInt();
        // int d = a*b*c;
        // int e = a+b+c;
        // System.out.println("output : " + (d/e));

        //Q4
        String name = scan.nextLine();
        float score = scan.nextFloat();
        scan.nextLine();
        String dept = scan.nextLine();
        System.out.println("My Name is : " + name);
        System.out.println("My Score is : " + score/10 + "/10");
        System.out.println("My Department is : " + dept);
        scan.close();
    }
    
}
