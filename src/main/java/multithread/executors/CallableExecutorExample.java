package multithread.executors;import java.util.ArrayList;import java.util.List;import java.util.concurrent.*;public class CallableExecutorExample {    public static void main(String[] args) throws InterruptedException, ExecutionException {        ExecutorService executor = Executors.newFixedThreadPool(3);        List<Future<Boolean>> futureTasks = new ArrayList<>();        for (int i = 0; i < 10; i++) {            Future<Boolean> future = executor.submit(new CallableTask());            futureTasks.add(future);        }        executor.awaitTermination(10, TimeUnit.SECONDS);        System.out.println(futureTasks.get(0).get());    }    static class CallableTask implements Callable {        @Override        public Object call() throws Exception {            System.out.println("inside CallableTask  impl " + Thread.currentThread().getName());            for (int i = 1; i < 100; i++) {                System.out.println(Thread.currentThread().getName() + " - " + i);            }            return true;        }    }}