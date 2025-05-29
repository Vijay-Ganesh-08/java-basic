import java.util.Random;
import java.util.Scanner;

public class doWhileLoop {

    public static void main(String[] args){
        //do-while is used when you need to execute the loop body at least once,
        //such as when prompting the user for input before checking if it is valid.

//        Random rand = new Random();
//        int newNum = 0;
//        do{
//            newNum = rand.nextInt(101);
//            System.out.println(newNum);
//        } while(newNum != 100);

        Scanner scan = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter the Number :");
            num = scan.nextInt();
        } while(num!=10);
    }
}
