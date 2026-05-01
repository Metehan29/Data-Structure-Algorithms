package Github;


public class Queue{

    private ListNode front;
    private ListNode rear;
    private int length;


    public class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data= data;
            this.next=null;
        }

    }

    public void push(int data){
        ListNode node = new ListNode(data);

        if (front==null){
            front=node;
        }
        else {
            rear.next=node;
        }
        length++;
        rear=node;
    }

    public void pop(){
        if (front==null){
            System.out.println("The set is already empty");
        }
        else {
            front=front.next;
        }
    }

    public void display(){
        ListNode temp = front;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public String getLength(){
        String result = "Length of the set is : " + length;
        return result;
    }
}









