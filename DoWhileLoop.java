public class DoWhileLoop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 1;
        do { // execution
            System.out.println(n + " Hello world");
            n++; // iterartion
        } while (n <= 5); // condition
        // while loop execute atleast once because they first execute and then cheack
        // the condition
    }
}