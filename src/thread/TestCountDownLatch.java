package thread;

import java.util.concurrent.CountDownLatch;

class Worker extends Thread{
    CountDownLatch countDownLatch;
    String name;

    public Worker(CountDownLatch countDownLatch,String name) {
        super(name);
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Worker thread"+Thread.currentThread().getName()+" started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker thread"+Thread.currentThread().getName()+" completed");
        countDownLatch.countDown();
    }
}

class Master extends Thread{
    String name;

    public Master(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Master "+Thread.currentThread().getName()+" started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Master "+Thread.currentThread().getName()+" completed");
    }
}



public class TestCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Worker A = new Worker(countDownLatch, "A");
        Worker B = new Worker(countDownLatch, "B");
        Master master = new Master("master");

        A.start();
        B.start();
        countDownLatch.await();
        master.start();

    }
}