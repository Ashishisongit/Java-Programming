import java.util.*;
public class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void Empty() {
        if (head == null) {
            System.out.println("LL is Empty !");
        }
    }

    public void display() {
        // if (head == null) {
        // System.out.println("LL is Empty !");
        // }
        Empty();
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addatIndex(int i, int data) {
        int count = 0;
        Node temp = head;
        if (head == null) {
            System.out.println("LL Doesn't exist");
            return;
        }
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (i > count) {
            System.out.println("Index out of Bound !");
            return;
        }
        temp = head;
        Node newNode = new Node(data);

        if (i == count) {
            addLast(data);
            return;
        }
        if (i == 0) {
            addFirst(data);
            return;
        }
        for (int j = 0; j < i - 1; j++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int sizecount() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void removeFirst() {
        Empty();
        Node temp = head;
        head = temp.next;
        // free(temp); //automatic garbage collector !
    }

    public void removeLast() {
        Empty();
        Node temp = head;
        if (head.next == null) {
            head = null;
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        // free(temp); //automatic garbage collector !
    }
    public  int search(int key){
        Node temp=head;
        int pos=0;
        while(temp!=null){
            if(key==temp.data){
                return pos;
            }
            temp=temp.next;
            pos++;
        }
        return -1;
    }
    public void reverseLL(){
        Node prev=null , curr=tail=head , next;
        while(curr!=null){
            next=curr.next; //next pointer pointing right node of curr 
            curr.next=prev; //prev pointing to right node 
            prev=curr; //prev becomes curr(left node)
            curr=next; //curr become next(right node)
        } 
          head=prev;
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        Scanner s=new Scanner(System.in);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addatIndex(0, 4);
        ll.addLast(3);
        ll.display();
        System.out.println("Total Number of Nodes : " + ll.sizecount());
        ll.removeFirst();
        ll.removeLast();
        ll.display();
        System.out.println("Total Number of Nodes : " + ll.sizecount());
        ll.reverseLL();
        System.out.print("Reversed Linked List : ");
        ll.display();

        System.out.print("Enter the Key : ");
        int n=s.nextInt();
        int result=ll.search(n);
        if(result>=0){
            System.out.println("Key Found at Index : "+result);
        }
        else{
            System.out.println("Key Not Found !");
        }
    }
}
