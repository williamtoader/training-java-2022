import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class Test {


    public static void main(String[] args) {
        DirectionThread ns = new DirectionThread("N-S"),
                ev = new DirectionThread("E-W");


        ns.run();
        ev.run();



    }
    static Semaphore outSemaphore = new Semaphore(1);
    static void output(String direction) throws InterruptedException {
        outSemaphore.acquire();
        System.out.println(direction);
        outSemaphore.release();
    }
}
