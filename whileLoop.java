import java.util.Random;

/**
 * Java while loop is a control flow statement used to execute the block of statements repeatedly
 * until the given condition evaluates to false. Once the condition becomes false,
 * the line immediately after the loop in the program is executed.
 */

public class whileLoop {
    public static void main(String[] args){

        //Best used when the number of iterations is not known in advance,
        //and the loop continues until a specific condition is met.

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println();
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println();
        Random random = new Random();
        int newNum =0;
                while(newNum!=5) {
                    newNum= random.nextInt(100);
                    System.out.println(newNum);
                }
        System.out.println("Random Matched:"+newNum);
    }
}
