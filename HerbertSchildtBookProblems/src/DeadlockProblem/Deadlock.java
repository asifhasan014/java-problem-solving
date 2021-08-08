
package DeadlockProblem;

/**
 *
 */
public class Deadlock implements Runnable{
    
    A a =new A();
    B b = new B();
    Thread t;
    
    Deadlock(){
    Thread.currentThread().setName("MainThread");
    t = new Thread(this,"RacingThread");
    }
    
    void deadlockstart(){
    t.start();
    a.foo(b);
        System.out.println("Back in main Tjread");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back in other Thread");
    }
    
}
