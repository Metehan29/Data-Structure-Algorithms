package LINKEDLIST;

public class MyLinkedList {
    public ListNode head;

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void firstAdd(int data) {
        ListNode node=new ListNode(data);

        if (head==null){
            head=node;
        }
        else {
            node.next = head;
            head = node;
        }

    }
    public void lastAdd(int data){
        ListNode node = new ListNode(data);
        if (head==null){
            head=node;
        }
        else {
            ListNode current = head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=node;
        }
    }
    public void IndexInsertion(int position , int data){
        ListNode node = new ListNode(data);
        if (position==1){
            node.next=head;
            head=node;
        }
        else if(position>length()+1){
            System.out.println("You entered index greater than length");
        }
        else {
            ListNode previous = head;
            int count =1;
            while (count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current = previous.next;
                previous.next=node;
                node.next=current;

        }
    }
}