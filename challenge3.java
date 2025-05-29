import java.util.Scanner;
public class challenge3 {

    public static void main(String[] args){
        //Q1
        Scanner scan = new Scanner(System.in);

        int[] marks = new int[5];
        for(int i=0;i<marks.length;i++){
            System.out.print("Enter the mark : ");
            marks[i]=scan.nextInt();
        }

        int total = 0;
        for(int i=0;i<marks.length;i++){
            total=total + marks[i];
        }

        System.out.println("Total:"+ total);
        int average = total/marks.length;
        System.out.println("Average:"+ average);
        System.out.println("Array : ");
        for(int i=0;i<marks.length;i++) {
            System.out.print(marks[i]);
        }

        //Q2
        for (int i=0;i<=10;i++){
            System.out.println(i+"x2="+i*2);
        }

        //Q3
        System.out.println("Enter the size of an Array");
        int size = scan.nextInt();
        int[] arraylist = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter the Array element:");
            arraylist[i]=scan.nextInt();
        }
        int middleElement = arraylist.length/2;
        System.out.println("Middle element:" + arraylist[middleElement]);
    }
}
