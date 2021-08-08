package QueueImplUsingStack;

public class MainClass {

    public static void main(String[] args) {
        QueueImpl qc = new QueueImpl();

        qc.push(10);
        qc.push(20);
        qc.push(30);
        qc.push(40);
        qc.push(50);
        
        System.out.println("Queue Data");
        
        qc.showInsert();
        qc.showPop();
        qc.showPop();
    }
}
