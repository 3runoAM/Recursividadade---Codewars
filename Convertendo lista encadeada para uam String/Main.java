
public class Main {
    public static void main(String[] args) {
        Node n = new Node(1, new Node(2, new Node(3)));

        System.out.println(Solution.stringify(n));
    }
}
