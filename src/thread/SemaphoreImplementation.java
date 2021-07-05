package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Semaphore{
    int maxCount; //max number of permits
    int userPermits=0; //permits given out

    public Semaphore(int maxCount) {
        this.maxCount = maxCount;
    }

    public synchronized void acquirePermit() throws InterruptedException {
        while(userPermits==maxCount){
            wait();
        }
        Thread.sleep(3000);
        userPermits++;
        System.out.println("permits acquired by "+Thread.currentThread().getName()+ " Current Permit: "+userPermits);
        notifyAll();
    }

    public synchronized void releasePermit() throws InterruptedException {
        while(userPermits==0){
            wait();
        }
        userPermits--;
        System.out.println("permits released by "+Thread.currentThread().getName()+ " Current Permit: "+userPermits);
        notifyAll();
    }
}

class SemAcquire implements Runnable{
    Semaphore semaphore;

    public SemAcquire(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquirePermit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SemRelease implements Runnable{
    Semaphore semaphore;

    public SemRelease(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.releasePermit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SemaphoreImplementation {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(5);
        SemAcquire semAcquire = new SemAcquire(semaphore);
        SemRelease semRelease = new SemRelease(semaphore);
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=0; i<5; i++){
            executor.execute(semAcquire);
        }

        for(int i=0; i<5; i++){
            executor.execute(semRelease);
        }

        executor.shutdown();
    }
}
