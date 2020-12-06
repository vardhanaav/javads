import java.util.*;

class LinkedList {

    Node head;
    Scanner sc = new Scanner(System.in);

    class Node {
        int data;
        Node next;

        Node (int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void createList() {
        System.out.println("Enter num of elements and elements");
        int q = sc.nextInt();

        int num = sc.nextInt();

        Node trav = new Node(num);
        head = trav;

        for (int i = 1; i < q; i++) {
            num = sc.nextInt();
            Node temp = new Node(num);
            trav.next = temp;
            trav = temp;
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String args[]) {
        // System.out.println("Hello!");
        LinkedList llist = new LinkedList();
        llist.createList();
        llist.display();
    }
}