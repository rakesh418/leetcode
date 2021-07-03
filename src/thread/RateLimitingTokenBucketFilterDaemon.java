package thread;

import java.util.HashSet;

public class RateLimitingTokenBucketFilterDaemon {
    private int MAX_TOKEN;
    long possibleTokens=0;

    public RateLimitingTokenBucketFilterDaemon(int MAX_TOKEN) {
        this.MAX_TOKEN = MAX_TOKEN;
        this.possibleTokens=MAX_TOKEN;
    }

    public void getToken() throws InterruptedException {
        synchronized (this){
            while(possibleTokens==0){
                this.wait();
            }
            possibleTokens--;
            this.notifyAll();
            }
        System.out.println("Granting " +Thread.currentThread().getName()+" token at "+System.currentTimeMillis()/1000);
    }

    private void daemonThread() throws InterruptedException {
        while(true){
            synchronized (this){
                if(possibleTokens<MAX_TOKEN){
                    possibleTokens++;
                    System.out.println("Current-Token: "+possibleTokens+ " -> added one token @"+System.currentTimeMillis()/1000);
                }
                this.wait();
                this.notifyAll();
                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RateLimitingTokenBucketFilterDaemon rateLimit = new RateLimitingTokenBucketFilterDaemon(5);
        HashSet<Thread> set = new HashSet<>();
        for(int i=0; i<12; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        rateLimit.getToken();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.setName("Thread-"+i);
            set.add(thread);
        }

        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    rateLimit.daemonThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();

        for(Thread thread: set){
            thread.start();
        }
        for(Thread thread: set){
            thread.join();
        }
    }
}
