package linkListProblems;

public class MainClass {
    
    public static void main(String[] args) {
        
       LinkedList listdata = new LinkedList();
       listdata.insert(5);
       listdata.insert(6);
       listdata.insert(7);
       listdata.insert(8);
       listdata.insert(9);
       listdata.insert(10);
       listdata.insert(11);
       listdata.insert(12);
       listdata.insertAtstart(25);
       listdata.insertAt(0,50);
       listdata.delete(2);
       
       listdata.show();
        
    }
}
