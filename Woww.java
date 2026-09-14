//WAP to access increament method of a class counter by taking it's reference into a thread class MyThread. Create 4 threads of MyThread class and access increament method of class counter.
class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}

class MyThread extends Thread {
    Counter c;

    MyThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            c.increment();
        }
    }
}

public class Woww {
    public static void main(String[] args) {

        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        MyThread t3 = new MyThread(c);
        MyThread t4 = new MyThread(c);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final count = " + c.count);
    }
}