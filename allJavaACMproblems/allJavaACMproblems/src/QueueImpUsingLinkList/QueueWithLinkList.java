package QueueImpUsingLinkList;

public class QueueWithLinkList {

    Node head;
    Node rear;
    Node front;

    int size = 0;

    public boolean isEmpty() {
        boolean active = false;

        if (size <= 0) {
            active = true;
        }

        return active;
    }

    public void enQue(int data) {

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (isEmpty()) {
            rear = newNode;
            head = rear;
            front = head;
            size++;
        } else {
            while (rear.next != null) {
                rear = rear.next;
            }
            rear.next = newNode;
            size++;
        }
    }

    public void deQueue() {
        size--;
        if (!isEmpty()) {
            front = front.next;
            head = front;
            front = head;
        } else {
            System.out.println("List is Empty");
        }
    }

    public void show() {
        Node temp = head;
        System.out.print("Element : ");
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        if (size > 0) {
            System.out.print(temp.data);
        }
        System.out.println(" ");
        if (size >= 0) {
            System.out.println("Size of the LinkiList is : " + size);
        } else {
            System.out.println("Size of the LinkiList is : " + 0);
        }
        System.out.println("");
    }

}
