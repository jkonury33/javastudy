package week3;

/**
 * Thread 예제 2
 * @author JiHong Jang
 * @since 2014. 3. 9.
 */
public class ThreadEx02 {
    public static void main(String[] args) {
        Thread03 thread1 = new Thread03("First");
        Thread03 thread2 = new Thread03("Second");
        Thread03 thread3 = new Thread03("Third");
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Thread03 extends Thread{
    String message;

    public Thread03(String message) {
        super();
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(message + "(" + getPriority() + ")");
        }
    }
}
