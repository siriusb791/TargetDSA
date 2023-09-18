package linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    LL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = head;
        }

    }

    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}
