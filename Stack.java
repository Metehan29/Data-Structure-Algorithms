package Stack;


public class Stack {
    private ListNode top;
    private int length;

    public class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }


    }

    public void push(int data) {
        ListNode node = new ListNode(data);
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        length++;

    }

    public void pop(){
        if (top==null){
            System.out.println("Set is already empty");
        }
        else {
            ListNode temp = top;
            top=temp.next;
            length--;
        }
    }

    public void display(){
        if (top==null){
            System.out.println("Stack is empty now.");
            return;
        }

        ListNode temp = top;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public int getLength(){
        return length;
    }
}


