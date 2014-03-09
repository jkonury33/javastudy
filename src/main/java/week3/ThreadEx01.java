package week3;

/**
 * 쓰레드 예제
 * @author JiHong Jang 
 * @since 2014.03.09
 */
public class ThreadEx01 {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread(new Thread2()).start();
    }
}

/**
 * 쓰레드 생성 방법1
 * Thread 상속
 */
class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Thread1 start()");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}

/**
 * 쓰레드 생성 방법 2
 * Runnable 구현 
 */
class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Thread2 start()");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
