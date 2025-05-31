import java.util.Scanner;

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
