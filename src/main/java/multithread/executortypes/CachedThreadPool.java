package multithread.executortypes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            service.execute(new RunnableTask());
        }
    }

    static class RunnableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("inside RunnableExample  impl " + Thread.currentThread().getName());
            for (int i = 1; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        }
    }
}
