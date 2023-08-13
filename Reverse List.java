import java.util.Scanner;
class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        next = null;
    }
}

class Main{
    
    static Node head;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int data = 0;
        int i = 0;
        while(data!=-1){
            // System.out.print("Enter the "+(i++)+"th element : ");
            data = sc.nextInt();
            insertAtEnd(data);
        }
        // printList();
        System.out.println(findMiddle());
        printList(reverseList());
    }
    
    static void insertAtEnd(int data){
        Node nn = new Node(data);
        
        if(head == null){
            head = nn;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = nn;
        
    }
    
    static void insertAtSt(int data){
        Node nn = new Node(data);
        nn.next = head;
        head = nn;
        
    }
    
    static void printList(Node h){
        Node current = h;
        while(current !=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    static int findMiddle(){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }


// REVERSE A LINKED LIST
    static Node reverseList(){
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }
}
