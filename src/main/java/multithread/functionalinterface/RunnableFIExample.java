package multithread.functionalinterface;public class RunnableFIExample {    public static void main(String[] args) {        Runnable runnableClassicStyle = new Runnable() {            @Override            public void run() {                System.out.println("Inside Runnable Classic");            }        };        Runnable runnableLatestStyle = () -> System.out.println("Inside Runnable Latest");        Thread t1 = new Thread(runnableClassicStyle);        t1.start();        Thread t2 = new Thread(runnableLatestStyle);        t2.start();    }}