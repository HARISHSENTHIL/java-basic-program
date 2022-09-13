class abc{
    int count = 0;
    synchronized public void increment(){
        count++;
        System.out.println(count);
    }
}

public class Threads2 {
    public static void main(String[] args) throws InterruptedException {
        abc a = new abc();
        Thread t = new Thread(new Runnable() {
            public void run(){
                for (int i = 0; i < 100; i++) {
                    a.increment();
                }
            }
        });

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    a.increment();
                }
            }
        });
        t.start();
        t1.start();

        t.join();
        t1.join();

        }
}
