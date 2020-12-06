import java.util.Scanner;

class QueueWithLinkedList {
    Node head, tail;
    Scanner sc = new Scanner(System.in);

    class Node {
        int data;
        Node next;

        Node (int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void enqueue(int n) {
        Node temp = new Node(n);
        this.tail.next = temp;
        this.tail = temp;
    }

    public int dequeue() {
        int bot = this.head.data;
        this.head = this.head.next;
        return bot;
    }

    public void display() {
        Node trav = this.head;
        while (trav.next != null) {
            System.out.print(trav.data + "-");
            trav = trav.next;
        }
        System.out.println(trav.data);
    }

    public void createQueue() {
        System.out.println("Enter number of elements of queue");
        int q = sc.nextInt();
        if (q < 1) {
            System.exit(0);
        }
        System.out.println("Enter the elements");
        
        int num = sc.nextInt();
        head = new Node(num);
        Node trav = head;

        for (int i = 1; i < q; i++) {
            num = sc.nextInt();
            Node temp = new Node(num);
            trav.next = temp;
            trav = temp;
        }

        tail = trav;
    }

    public static void main(String args[]) {
        Scanner scs = new Scanner(System.in);
        QueueWithLinkedList obj = new QueueWithLinkedList();
        obj.createQueue();
        obj.display();
        System.out.println("Enter a number to enqueue");
        int n = scs.nextInt();
        obj.enqueue(n);
        obj.display();
        int item = obj.dequeue();
        System.out.println("Printing after dequeuing " + item);
        obj.display();
        item = obj.dequeue();
        System.out.println("Printing after dequeuing " + item);
        obj.display();
        scs.close();
    }

}