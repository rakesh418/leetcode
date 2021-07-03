package thread;

import java.sql.Time;
import java.util.HashSet;

public class RateLimitingTokenBucketFilter {
    private int MAX_TOKEN;
    private long lastTimeRequest;
    long possibleTokens=0;

    public RateLimitingTokenBucketFilter(int MAX_TOKEN) {
        this.MAX_TOKEN = MAX_TOKEN;
    }

    public synchronized void getToken() throws InterruptedException {

        long currentTimeMilliSec = System.currentTimeMillis();
        possibleTokens+=(currentTimeMilliSec-lastTimeRequest)/1000;
        if(possibleTokens>=MAX_TOKEN)
            possibleTokens=MAX_TOKEN;
        if(possibleTokens==0) {
            Thread.sleep(1000);
        }else{
            possibleTokens-=1;
        }
        lastTimeRequest=System.currentTimeMillis();
        System.out.println("Granting " +Thread.currentThread().getName()+" token at "+System.currentTimeMillis()/1000);
    }

    public static void main(String[] args) throws InterruptedException {
        RateLimitingTokenBucketFilter rateLimit = new RateLimitingTokenBucketFilter(5);
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

        for(Thread thread: set){
            thread.start();
        }
        for(Thread thread: set){
            thread.join();
        }
    }
}
