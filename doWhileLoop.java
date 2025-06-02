import java.util.Random;
import java.util.Scanner;

/**
 * Java do-while loop is an Exit control loop. Unlike for or while loop,
 * a do-while check for the condition after executing the statements of the loop body.
 *
 * do-while is used when you need to execute the loop body at least once,
 * such as when prompting the user for input before checking if it is valid.
 */
public class doWhileLoop {

    public static void main(String[] args){


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
