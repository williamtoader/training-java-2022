package semaphore;

import java.util.concurrent.Semaphore;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Thread ns = new Thread(new DirectionThread("N-S")),
                ew = new Thread(new DirectionThread("E-W"));
        ns.start();
        ew.start();
    }
    static Semaphore sem = new Semaphore(1);

    static void output(String direction, boolean isStarting) throws InterruptedException {
        if(isStarting) {
            System.out.println(direction + " waits for permit");
            sem.acquire();
            System.out.println(direction + " starts");
        }
        else {
            System.out.println(direction + " stops");
            sem.release();
        }
    }
}