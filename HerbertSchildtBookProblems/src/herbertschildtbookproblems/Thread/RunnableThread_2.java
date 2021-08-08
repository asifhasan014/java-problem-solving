package herbertschildtbookproblems.Thread;

public class RunnableThread_2 {

    public static void main(String[] args) {
        //System.out.println("hello asif");
        RunnableThread_1 nt = new RunnableThread_1();//creating a new thread
        //System.out.println("Hi there");
        nt.t.start();//start the thread
        //System.out.println("Hello baby");

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread :" + i);
                System.out.println("");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted :"+e);
        }
        System.out.println("Main thread exiting");
    }
}
