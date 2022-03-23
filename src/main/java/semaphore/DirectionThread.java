package semaphore;

public class DirectionThread implements Runnable{
    String direction = "";
    public DirectionThread(String direction) {
        this.direction = direction;
    }


    @Override
    public void run() {
        try {
            while(!Thread.interrupted()) {
                Test.output(direction, true);
                Thread.sleep((long)(Math.abs(Math.random())*1000));
                Thread.yield();
                Test.output(direction, false);
            }
            if(Thread.interrupted()) throw new InterruptedException();
        }
        catch (InterruptedException e) {
            System.out.println("Execution stopped");
        }
    }
}

