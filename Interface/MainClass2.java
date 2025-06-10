package Interface;

import java.io.File;

interface Readable{
    void read();
}

interface Writable{
    void write();
}
interface Storable{
    void store();
}

class file implements Readable,Writable,Storable{

    @Override
    public void read() {
        System.out.println("Reads the File");
    }

    @Override
    public void store() {
        System.out.println("Stores the File");
    }

    @Override
    public void write() {
        System.out.println("Writes the File");
    }
}
public class MainClass2 {

    public static void main(String[] args){
        file fileObj = new file();
        fileObj.read();
        fileObj.write();
        fileObj.store();
    }
}
