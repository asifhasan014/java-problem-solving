package herbertschildtbookproblems.Thread;

import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

/**
 *Creating Multiple thread 
 *
 *
 */
public class Multiplethread_2 implements Runnable {

    String name;
    Thread t;

    Multiplethread_2(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New thread :" + t);

    }

    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " " + i);
                Thread.sleep(1000);
            }
        } catch (InternalException e) {
            System.out.println(name + " Interrupted");
        } catch (InterruptedException ex) {
            Logger.getLogger(Multiplethread_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(name + " Existing");

    }
}
