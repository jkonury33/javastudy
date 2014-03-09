package week3;

/**
 * Thread 우선순위
 * @author JiHong Jang
 * @since 2014. 3. 9.
 */

public class ThreadEx03 {
    public static void main(String[] args) {
        Thread04 thread1 = new Thread04("First", Thread.NORM_PRIORITY);
        Thread04 thread2 = new Thread04("Second", Thread.MAX_PRIORITY);
        Thread04 thread3 = new Thread04("Third", Thread.MIN_PRIORITY);
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Thread04 extends Thread{
    String message;

    public Thread04(String message, int priority) {
        super();
        this.message = message;
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(message + "(" + getPriority() + ")");
        }
    }
}