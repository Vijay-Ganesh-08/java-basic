import java.util.Random;
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
