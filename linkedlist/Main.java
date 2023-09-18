package linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(21);
        list.insertFirst(11);
        list.insertFirst(32);
        list.insertFirst(211);


        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertLast(22);
        list1.insertLast(23);
        list1.insertLast(24);
        list1.insertLast(25);
        list1.insertLast(26);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list1.insertLastWithoutTail(1);
        list1.insertLastWithoutTail(2);
        list1.insertLastWithoutTail(3);
        list1.insertLastWithoutTail(4);

//        list.display();
        System.out.println("-------------------------------");
//        list1.display();
        System.out.println("-------------------------------");
        list2.display();

    }
}
