package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable implements Callable<Integer> {
    int n;
//    ThreadLocal<Integer> counter = ThreadLocal.withInitial(() -> 0);
    public TestCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i=1; i<=n;i++){
            Thread.sleep(50);
            sum+=i;
        }
//        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) throws Exception {
        TestCallable callable = new TestCallable(100);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> future= executor.submit(callable);
        while(!future.isDone()){
            System.out.println("waiting for future task to be completed");
        }
        System.out.println();
        executor.shutdown();
        System.out.println("completed");

    }
}
