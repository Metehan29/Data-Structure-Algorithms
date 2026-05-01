package Stack;

public class Stack_main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(27);
        stack.push(35);
        stack.push(36);



        stack.display();
        System.out.println(stack.getLength());

    }
}
