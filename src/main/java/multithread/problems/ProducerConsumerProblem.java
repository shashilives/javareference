package multithread.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Product product = new Product();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    product.produce();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(producer);
        executorService.execute(producer);
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    product.consumer();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //producer.start();
        consumer.start();

        producer.join();
        consumer.join();
        System.out.println("over");
    }

}

class Product {

    int productCount = 0;

    public void produce() throws InterruptedException {

        while (true) {
            synchronized (this) {
                while (productCount == 5)
                    wait();
                System.out.println("producer " + productCount);
                productCount++;
                notify();
                Thread.sleep(230);
            }
        }

    }

    public void consumer() throws InterruptedException {

        while (true) {

            synchronized (this) {
                if (productCount == 0) {
                    wait();
                }
                System.out.println("Consumer " + productCount);
                productCount--;
                notify();
                Thread.sleep(600);
            }
        }


    }
}
