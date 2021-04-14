import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterruptingThreadExample extends Thread {

    static Logger logger;
    static ConsoleHandler handler;

    static {

        logger = Logger.getAnonymousLogger();
        logger.setLevel(Level.FINE);
        handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);

    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Hello");
        } catch (InterruptedException e) {
            logger.log(Level.FINE, e.getMessage());
        }
    }

    public static void main(String[] args) {

        InterruptingThreadExample t1 = new InterruptingThreadExample();
        t1.start();
        try
        {
            t1.interrupt();
        }catch(Exception e){
            logger.log(Level.FINE, e.getMessage());
        }

    }

}
