package Threads;

/**
 * Thread is implemented by Runnable interface by default
 * if a class implements Runnable and when Thread needs to be involved it can be done only by Thread object.
 */
class sample implements Runnable{
    public void run(){
        System.out.println("Thread is executed via Runnable Interface");
    }
}
public class RunnableThreads {

    public static void main(String[] args){
        sample obj = new sample();
        Runnable obj1 = new sample();
        Thread thread = new Thread(obj);
        thread.start();
        Thread thread1 = new Thread(obj1);
        thread1.start();

    }
}
