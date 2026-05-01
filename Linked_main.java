package LINKEDLIST;

public class Linked_main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.firstAdd(35);
        linkedList.lastAdd(23);
        linkedList.IndexInsertion(2,87);
        linkedList.display();
        System.out.println(linkedList.length());


    }

}
