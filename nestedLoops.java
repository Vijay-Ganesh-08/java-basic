public class nestedLoops {

     public static void main(String[] args){

         for(int i=0;i<5;i++){
             for(int j=0;j<=i;j++){
                 System.out.print("x");
             }
             System.out.println();
         }
         System.out.println();

         for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
                 System.out.print("x");
             }
             System.out.println();
         }
         System.out.println();

         for(int i=5;i>0;i--){
             for(int j=0;j<i;j++){
                 System.out.print("x");
             }
             System.out.println();
         }
     }
}
