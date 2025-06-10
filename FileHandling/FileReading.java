package FileHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * FileReader - Read each character from the file.
 * when it reaches the end the char value will be -1
 *
 * BufferedReader - Read each line from the file.
 * when it reaches the end the value will be null
 */
public class FileReading {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("input.txt");
            int c = fileReader.read();
//            System.out.print((char) c);
//            c = fileReader.read();
//            System.out.print((char) c);
//            c = fileReader.read();
//            System.out.print((char) c);
//            c = fileReader.read();
//            System.out.print(c);
            System.out.println("Reading with FileReader");
            while(c!=-1){
                System.out.print((char) c);
                c = fileReader.read();
            }
            fileReader.close();
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println();
        }

        try{
            FileReader fileReader = new FileReader("input1.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("Reading with BufferedReader");
            String text = bufferedReader.readLine();
            while (text!=null){
                System.out.println(text);
                text = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
