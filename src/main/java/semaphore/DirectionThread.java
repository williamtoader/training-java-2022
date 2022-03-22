import java.util.concurrent.Semaphore;

public class DirectionThread implements Runnable{
    String direction = "";
    public DirectionThread(String direction) {
        this.direction = direction;
    }


    @Override
    public void run() {
        try {
            while(!Thread.interrupted()) {
                Thread.sleep(200);
                Thread.yield();
                Test.output("Masina in directia " + direction);
            }
            if(Thread.interrupted()) throw new InterruptedException();
        }
        catch (InterruptedException e) {
            System.out.println("Execution stopped");
        }
    }
}


