import java.util.Scanner;

class NotValidException extends Exception{
    NotValidException(String message){
        super(message);
    }
}
public class CustomException {

    public static void main(String[] agrs) throws NotValidException {
        Scanner scan = new Scanner(System.in);

        try{
            int age = scan.nextInt();
            if(age<18){
                throw new NotValidException("Your Age should be greater than 18");
            }
        }
        catch (NotValidException ex) {
            System.out.println(ex);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
