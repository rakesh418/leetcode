package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Task implements Runnable{
    CyclicBarrier cyclicBarrier;

    public Task(CyclicBarrier barrier){
        this.cyclicBarrier = barrier;
    }

    @Override
    public void run() {
        System.out.println("Task "+Thread.currentThread().getName()+" awaiting at barrier point");
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("Task "+Thread.currentThread().getName()+" has crossed  the barrier point");
    }
}

public class TestCyclicBarrier {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("All parties have arrived .. lets start execution now");
            }
        });
        Thread t1 = new Thread(new Task(cyclicBarrier),"t1");
        Thread t2 = new Thread(new Task(cyclicBarrier),"t2");
        Thread t3 = new Thread(new Task(cyclicBarrier),"t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
