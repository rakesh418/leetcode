package thread;
public class BlockingQueue<T> {
     T[] arr;
     Object lock = new Object();
     int size= 0;
     int capacity;
     int head = 0;
     int tail = 0;

     public BlockingQueue(int capacity){
         this.capacity=capacity;
         this.arr = (T[])new Object[capacity];
     }
    public void enque(T item) throws InterruptedException {
         synchronized (lock){
            while(size==capacity){
                lock.wait();
            }
            if(tail==capacity){
                tail=0;
            }
            arr[tail]=item;
            tail++;
            size++;
            lock.notifyAll();
         }
    }

    public T deque() throws InterruptedException{
        T item =null;
         synchronized (lock) {
            while(size == 0) {
                lock.wait();
            }
            if(head==capacity){
                head=0;
            }
            item = arr[head];
            head++;
            size--;
            lock.notifyAll();
        }
        return item;
    }

    public static void main(String[] args) throws InterruptedException {
         final BlockingQueue<Integer> q = new BlockingQueue<>(5);

         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 for(int i=0; i < 1000;i++){
                     try {
                         q.enque(i);
                         Thread.sleep(500);
                         System.out.println("Thread1 : Enqued "+i);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             }
         });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 500;i++){
                    try {
                        int item = q.deque();
                        Thread.sleep(1000);
                        System.out.println("Thread2 : Dequed "+item);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 1000;i++){
                    try {
                        int item = q.deque();
                        Thread.sleep(1000);
                        System.out.println("Thread3 : Dequed "+item);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Successfully Completed");
    }
}
