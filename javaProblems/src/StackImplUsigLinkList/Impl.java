package StackImplUsigLinkList;

public class Impl {

    Node head = null;
    public void push(int data) {
     Node node = new Node();
     node.data=data;
     node.next=head;
     head=node;
    }
    public void pop(){
        head=head.next;
    }
    public int size(){
        int count=0;
        Node node= head;
        while(node.next!=null){
            count++;
            node=node.next;
        }
        count=count+1;
        return count;
    }
    public void display(){
    if(head == null){
        System.out.println("there is no elements");
    }
    Node node=head;
    while(node.next!=null){
        System.out.println(node.data);
        node=node.next;
    }
        System.out.println(node.data);
    }
}
