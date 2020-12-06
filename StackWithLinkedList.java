import java.util.Scanner;

public class StackWithLinkedList {

    Node head, tail;
    Scanner sc = new Scanner(System.in);

    class Node {
        int data;
        Node next;
        Node prev;

        Node (int d) {
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }


    public void push(int val) {        
        Node temp = new Node(val);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }


    public int pop() {
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        return temp.data;
    }


    public void createList() {

        System.out.println("Enter the num of elements and the elements");
        int q = sc.nextInt();

        int num = sc.nextInt();

        Node trav = new Node(num);
        head = trav;

        for (int i=1; i<q; i++) {
            num = sc.nextInt();
            Node temp = new Node(num);
            trav.next = temp;
            temp.prev = trav;
            trav = temp;
        }

        tail = trav;
    }


    public void display() {
        Node temp = this.head;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }


    public void displayReverse() {
        Node temp = this.tail;
        while (temp.prev != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println(temp.data);
    }


    public static void main(String args[]) {
        Scanner scs = new Scanner(System.in);
        StackWithLinkedList obj = new StackWithLinkedList();
        obj.createList();
        obj.display();
        obj.displayReverse();

        System.out.println("Enter a number to push");
        int val = scs.nextInt();
        obj.push(val);

        obj.display();
        obj.displayReverse();
        
        System.out.println("Popping the top value");
        int top = obj.pop();
        System.out.println("Popped value = " + top);

        obj.display();
        obj.displayReverse();

        scs.close();
    }
    
}
