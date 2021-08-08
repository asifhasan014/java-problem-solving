package LinkListPractice;
public class FunctionClass {
    Node head;
    public void insert(int data){
        
        Node node = new Node();
        node.data=data;
        node.next=null;
        
        if(head == null){
            head=node;
        }else{
          Node n=head;
          while(n.next!=null){
              n=n.next;
          }
          n.next=node;
        }
    }
    
    public void display(){
        Node node=head;
        while(node.next!=null){
            System.out.print(node.data+"->");
            node=node.next;
        }
        System.out.print(node.data);
        System.out.println("");
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }else{
        node.next=head;
        head=node;
        }
        
    }
    public void insertAtPosition(int data, int index){
        Node node = new Node();
        node.data=data;
        node.next=null;
        
        if(index==0){
        insertAtStart(data);
        }else{
         Node n=head;
         for(int i=0;i<index-1;i++){
             n=n.next;
         }
         node.next = n.next;
         n.next = node;
         
        }
    }
    public void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node n1= new Node();
            n1=head;
            Node n2=null;
            
            for(int i=0;i<index-1;i++){    
            n1=n1.next;
            }
            n2=n1.next;
            n1.next=n2.next;
            n2=null;
        }
    }
}
