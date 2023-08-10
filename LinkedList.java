import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    static Node head;
    //Driver method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);
        InsertAtBeg(6);
        InsertAtBeg(7);
        display();
        
        deleteNode(3); // Example of deleting a node with data 3
        display();
        
        System.out.println(searchData(4)); // Example of searching for data 4
        System.out.println(searchData(8)); // Example of searching for data 8
    }

    //insert at end
    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }
    //insert at beginning
    static void InsertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //delete a node by value
    static void deleteNode(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    //Searching a node  by its data
    static boolean searchData(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    //To display the data in linkedList
    public static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
