package herbertschildtbookproblems.Thread;

//Controlling the main thread
public class CurrentThreadDemo {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread..:" + t);

        // Change the name of the thread
        t.setName("My thread");
        System.out.println("After name change..:" + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Main Thread interrupted");
        }

    }

}
