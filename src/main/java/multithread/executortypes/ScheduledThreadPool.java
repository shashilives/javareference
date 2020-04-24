package multithread.executortypes;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);

        service.schedule(new Task(),3, TimeUnit.SECONDS);

        service.scheduleAtFixedRate(new Task(), 10, 3, TimeUnit.SECONDS);

        service.scheduleWithFixedDelay(new Task(), 1,5,TimeUnit.SECONDS);

    }

    static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("inside RunnableExample  impl " + Thread.currentThread().getName());
            for (int i = 1; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        }
    }
}
