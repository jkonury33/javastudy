package week3;

public class ThreadEx04 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Thread05());
        thread.start();
        
        for (int i = 0; i < 100; i++) {
            Thread.sleep(20);
            System.out.println("main Thread");
        }
        
        thread.join();
        
        System.out.println("main 프로그램 종료");
        
    }
}

class Thread05 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread05 start()");
        }
    }
    
}
