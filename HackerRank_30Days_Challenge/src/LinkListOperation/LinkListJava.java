package LinkListOperation;

import java.util.Stack;

public class LinkListJava {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void insertAt(int data, int position) {
        int count = 0;
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (position == 0) {
            insertAtStart(data);
        } else {
            Node currentnode = head;
            while (count < position - 1) {
                count++;
                currentnode = currentnode.next;
            }
            node.next = currentnode.next;
            currentnode.next = node;
        }
    }

    public void delete(int position) {
        if (head == null) {
            System.out.println("List is enpty please insert the value");
        } else {
            int count = 0;
            Node node = head;
            while (count < position - 1) {
                count++;
                node = node.next;
            }
            node.next = node.next.next;
        }
    }

    public void length() {
        int count = 0;
        Node node = head;
        if (head == null) {
            System.out.println("length is 0");
        } else {
            while (node != null) {
                count++;
                node = node.next;
            }
            System.out.println("length is : " + count);
        }

    }

    public void Searchvalue(int data) {
        int count = 0;
        int key=0;
        Node node = head;
        while (node != null) {
            count++;
            if (node.data == data) {
                System.out.println(data + " " + "is found at the position of " + count);
                key++;
            }
            node = node.next;
        }
        if(key==0){
            System.out.println("Sorry data is not founded");
        }

    }
    public void revers(){
    Node currentnode=head;
    Node previousnode=null;
    Node newnode=null;
    while(currentnode!=null){
        newnode=currentnode.next;
        currentnode.next=previousnode;
        previousnode=currentnode;
        currentnode=newnode;
    }
    head=previousnode;
    display();
    }
    
    public void palindrom(){
        int count=0;
        int key=0;
    if(head==null||head.next==null){
        System.out.println("List is empty please inert the value");
    }
    Node slow;
    Node fast;
    slow=fast=head;
    Stack<Node> s=new Stack<Node>();
    s.push(slow);
    
    while(fast.next!=null&&fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        s.push(slow);
    }
    if(fast.next==null){
        s.pop();
    }
    Node secondhalf=slow.next;
    while(secondhalf!=null){
    if(secondhalf.data==s.pop().data){
        count++;
    }
    secondhalf=secondhalf.next;
    key++;
    }
    if(count==key){
        System.out.println("It is Palindrom");
    }
    else{
        System.out.println("It is not palindrom");
    }
    }

    public void display() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
