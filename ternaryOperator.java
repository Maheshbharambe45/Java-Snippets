public class ternaryOperator {
    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
        int num = 4;
// ternary operator
        //syntax
        //variable = (condition)?condition true : condition false ;
        
        String output = (num % 2==0)? "Even" : "Odd";
        System.out.println(output);
    }
}