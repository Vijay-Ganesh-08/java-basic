// import com.sun.tools.javac.util.StringUtils;

import java.util.Scanner;

public class string {

    public static void main(String[] args) {
        
        String a1 = "Apple";
        String a2 = "Apple";
        //compares the reference object address
        if (a1 == a2){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //compares the content 
        if(a1.equals(a2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        String s1 = new String("Apple");
        String s2 = new String("Apple");
        //compares the reference object address
        if (s1 == s2){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //compares the content 
        if(s1.equals(s2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = scan.nextLine();
        
        if(name.equals("Vijay"))
        {
            System.out.println("Name Matched");
        } else {
            System.out.println("Name UnMatched");
        }
        scan.close();
    }

}
