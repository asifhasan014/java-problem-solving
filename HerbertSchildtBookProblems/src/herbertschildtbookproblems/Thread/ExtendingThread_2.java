package herbertschildtbookproblems.Thread;
/*
Thread implementation using extends thread class
*/
 
public class ExtendingThread_2 {

    public static void main(String[] args) {
        ExtendingThread_1 nt = new ExtendingThread_1();// create a new thread
        nt.start();//start the thread
        System.out.println("");


        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread :" + i);
                System.out.println("");
                Thread.sleep(1000);
            }
    }
            catch(InterruptedException e){
            System.out.println("Main interrupted");
            }
        System.out.println("Main thread exiting");
        

    }
}