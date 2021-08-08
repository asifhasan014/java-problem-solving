
package herbertschildtbookproblems.Thread;
/*
*implements Runnable  method to create new thread
**/
public class RunnableThread_1 implements Runnable {
    Thread t;
    RunnableThread_1(){
        //Create a new second thread
         t = new Thread(this,"Demo thread");
         System.out.println("child thread :"+t);
    }

    @Override
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println("child thread :"+i);
                System.out.println("");
                Thread.sleep(500);
            }
        }
        catch(Exception e){
            System.out.println("child interrupted");
        }
        System.out.println("Existing child thread");
    }
    
}
