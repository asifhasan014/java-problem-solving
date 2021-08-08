package herbertschildtbookproblems.Thread;

public class ExtendingThread_1 extends Thread {

    ExtendingThread_1() {
        super("Demo thread");
        System.out.println("Child thread :" + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child thread :" + i);
                System.out.println("");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child interrupted");
        }
        System.out.println("Existing child thread");
    }

}
