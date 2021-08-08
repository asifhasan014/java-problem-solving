package QueueImplementation;

public class Queue {

    int queue[] = new int[5];
    int rear = 0;
    int size = 0;
    int front = 0;

    public void enQueue(int data) {
        try {
            if (size > 4) {
                System.out.println("Queue is full");
            } else {
                queue[rear] = data;
                rear=(rear+1)%5;
                size++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void dQueue() {
        try {
            if(size>0){
            front = (front + 1)%5;
            size = size - 1;
            }else{
                System.out.println("Queue is empty");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(queue[(front + i)%5]);
        }
        System.out.println("lengthis " +size);
    }
}
