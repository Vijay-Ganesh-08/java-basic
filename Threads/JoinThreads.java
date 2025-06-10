package Threads;

/**
 * Thread.Join() is used when we want the main Thread needs to wait until the class thread is executed
 * Removing obj.join() from the below code will print j=0 since the main thread is ended as soon as Thread A is called
 * Keeping obj.join() from the below code will print j=49 since the main thread will wait until Thread A is executed
 */
class A extends Thread{
    int j = 0;
    public void run(){
        for(int i=0;i<50;i++){
            j=i;
        }
    }
}
public class JoinThreads {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        obj.start();
        obj.join();
        System.out.println(obj.j);
    }
}
