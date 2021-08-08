package herbertschildtbookproblems.Thread;

public class JoinAndIsAlive {

    public static void main(String[] args) {
        Multiplethread_2 nt1 = new Multiplethread_2("one");
        Multiplethread_2 nt2 = new Multiplethread_2("Two");
        Multiplethread_2 nt3 = new Multiplethread_2("three");

        //starting the thread
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("thread one is alive :" + nt1.t.isAlive());
        System.out.println("thread two is alive :" + nt2.t.isAlive());
        System.out.println("thread three is alive :" + nt3.t.isAlive());

        try {
            System.out.println("waiting for thread to finish");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch (Exception e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("thread one is alive :" + nt1.t.isAlive());
        System.out.println("thread two is alive :" + nt2.t.isAlive());
        System.out.println("thread three is alive :" + nt3.t.isAlive());
        
        System.out.println("Main thread existing");
              

    }
}
