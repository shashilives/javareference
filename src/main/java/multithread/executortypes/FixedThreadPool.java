package multithread.executortypes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            service.execute(new RunnableTask());
        }

        service.shutdown();
    }

    static class RunnableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("inside RunnableTask  impl " + Thread.currentThread().getName());
            for (int i = 1; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        }
    }
}
