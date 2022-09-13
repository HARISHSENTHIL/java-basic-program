class aaaa {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
            ;
        }

        System.out.println("PUT "+num);
        this.num = num;
        valueSet = true;
    }

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
            ;
        }

        System.out.println("GET "+num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    aaaa a;

    Producer(aaaa a) {
        this.a = a;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            a.put(i++);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            ;
        }
    }
}

class Consumer implements Runnable {
    aaaa a;

    Consumer(aaaa a) {
        this.a = a;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while (true) {
            a.get();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            ;
        }
    }
}

public class WaitNotify {
        public static void main(String[] args) {

            aaaa a = new aaaa();
            new Producer(a);
            new Consumer(a);
        }
    
}
