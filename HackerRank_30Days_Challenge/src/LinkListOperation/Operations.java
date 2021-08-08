package LinkListOperation;

import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        System.out.println("Enter your choice");
        System.out.println("1. Insert a value into a link list");
        System.out.println("2. Insert a value at the start poin in a link list");
        System.out.println("3. Insert a value at any point in a link list");
        System.out.println("4. Delete a value from link list");
        System.out.println("5. Length Calculation");
        System.out.println("6. Reverse link list");
        System.out.println("7. Palindrom check");
        System.out.println("8. Search data into linklist");
        System.out.println("9. Display");
        System.out.println("10. Exit");

        int option;
        int position;
        int objValue;
        Scanner input = new Scanner(System.in);
        LinkListJava obj = new LinkListJava();

        do {
            System.out.println("========================================");
            System.out.print("Please Enter an option :");
            option = input.nextInt();
            System.out.println("========================================");
            switch (option) {
                case 1:
                    System.out.println("Please enter the vslue");
                    objValue = input.nextInt();
                    obj.insert(objValue);
                    //System.out.println("inserted");
                    //insert();
                    break;
                case 2:
                    System.out.println("Please enter the vslue");
                    objValue = input.nextInt();
                    obj.insertAtStart(objValue);
                    break;
                case 3:
                    System.out.print("Enter the position number : ");
                    position = input.nextInt();
                    System.out.print("Enter the data : ");
                    objValue = input.nextInt();
                    obj.insertAt(objValue, position);
                    break;
                case 4:
                    System.out.println("Enter the index number");
                    position=input.nextInt();
                    obj.delete(position);
                    break;
                case 5:
                    obj.length();
                    break;
                case 6:
                    System.out.println("Revers link list");
                    obj.revers();
                    break;
                case 7:
                    System.out.println("Result :");
                    obj.palindrom();
                    break;
                case 8:
                    System.out.println("Please enter the vslue that you want to search");
                    objValue=input.nextInt();
                    obj.Searchvalue(objValue);
                    break;
                case 9:
                    System.out.println("Inserted Element is :");
                    obj.display();
                    break;
                default:
                    System.out.println("Exit");
                    break;

            }

        } while (option != 10);
    }
}
