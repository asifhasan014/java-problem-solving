package QueueImpUsingLinkList;

public class MainClass {
    public static void main(String[] args) {
        QueueWithLinkList qc = new QueueWithLinkList();
        
        qc.enQue(10);
        qc.enQue(20);
        qc.enQue(30);
        qc.enQue(40);
        qc.enQue(50);
      
        qc.show();
        
        qc.deQueue();
        qc.deQueue();
        qc.deQueue();
        qc.deQueue();
        qc.deQueue();
        qc.deQueue();
        
        qc.show();
        
    }
}
