package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool implements Runnable{
    @Override
    public void run() {
        System.out.println("Testing thread pool concept with thread : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        TestThreadPool threadPool = new TestThreadPool();

//        Executor executor = Executors.newFixedThreadPool(5);
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=1; i<= 100; i++){
            executor.execute(threadPool);
            System.out.println(i);
        }
        executor.shutdown();
        while(!executor.isTerminated()){ }
        System.out.println("terminated");

    }
}
