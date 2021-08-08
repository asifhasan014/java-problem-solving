package QueueImplUsingStack;

public class QueueImpl {

    int stack1[] = new int[5];
    int stack2[] = new int[5];
    int temp[] = new int[5];

    int top1 = 0;
    int top2 = 0;
    int size = 0;
    int count = 1;

    public void push(int data) {
        if (top1 > 4) {
            System.out.println("Queue is full");
        } else {
            stack1[top1] = data;
            top1++;

        }
    }

    public int pop() {
        int data;
        top1--;
        data = stack1[top1];
        return data;
    }

    public void push2() {
        if (top2 > 4) {
            System.out.print("");
        } else {
            stack2[top2] = pop();
            top2++;
            size++;

        }
    }

    public void pop2() {
        int j = 1;
        for (int i = 0; i < size; i++) {
            temp[i] = stack2[size - j];
            j++;
        }
    }

    public void showInsert() {
        for (int data : stack1) {
            System.out.println(data);
        }
        System.out.println("Size of the Queue : " + top1);
    }

    public void showPop() {
        for (int data : stack1) {
            push2();
        }
        System.out.println("Data 2:");
        
        pop2();
        System.out.println("Delete "+count+" item");
        for (int i = count; i < size; i++) {
            System.out.println(temp[i]);
        }
        count++;
    }

}
