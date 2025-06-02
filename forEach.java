import java.util.Scanner;

/**
 * The for-each loop in Java (also called the enhanced for loop) was introduced
 * in Java 5 to simplify iteration over arrays and collections.
 * It is cleaner and more readable than the traditional for loop and is
 * commonly used when the exact index of an element is not required.
 */
public class forEach {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size = scan.nextInt();
        int[] arrayList = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Enter the Array Element:");
            arrayList[i]=scan.nextInt();
        }

        for(int num:arrayList){
            System.out.println("Array Element : " + num);
        }
    }
}
