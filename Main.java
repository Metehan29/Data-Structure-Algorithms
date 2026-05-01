package Github;

public class Main {
    public static void main(String[] args) {

        Queue node = new Queue();
        node.push(56);
        node.push(89);
        node.push(205);
        node.push(25);
        node.display();
        System.out.println("After pop operation : ");
        node.pop();
        node.display();
        System.out.println(node.getLength());


    }
}
