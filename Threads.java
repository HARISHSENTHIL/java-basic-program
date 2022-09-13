/*
run()
start()
lambda func
Thread class 
Runnable Interface 
setname() 
getname() 
setPriority() 
getPriority() 
join() 
isalive()
*/

class Hi extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread().getName());

            System.out.println("hi class");
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread());

            System.out.println("Hello class");
        }
    }
}

class welcome implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread());

            System.out.println("Hello class");
        }
    }
}

class Threads {
    public static void main(String[] args) throws InterruptedException {

        Runnable h = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
                System.out.println(Thread.currentThread());

                System.out.println("welcome class");
            }
        };
        Thread t = new Thread(h);
        Hello s = new Hello();
        Hi j = new Hi();
        t.setPriority(1);

        t.setName("name");
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.isAlive());
        j.start();
        s.start();

        t.join();
        j.join();
        s.join();
        System.out.println(t.isAlive());
        System.out.println("bye");

    }
}
