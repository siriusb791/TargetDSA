package linkedlist;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    SinglyLinkedList() {

        this.head = null;
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertLastWithoutTail(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size is : " + size);
    }

    private class Node {
        private int value;
        private Node next;

        //for the 1st Node
        Node(int value) {
            this.value = value;
        }

        //after 1st node
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
