import java.util.*;

public class CalcUsingSwitch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A");
    int a = sc.nextInt();
    System.out.println("Enter B");
    int b = sc.nextInt();
    System.out.println("Enter Operator");
    char c = sc.next().charAt(0);

    switch (c){
        case '+':
            System.out.println("Addition is "+(a+b));
            break;
        case '-':
            System.out.println("Substraction is "+(a-b));
            break;
        case '*':
            System.out.println("Multiplication is "+(a*b));
            break;
        case '/':
            System.out.println("Division is "+(a/b));
            break;
        case '%':
            System.out.println("Modulo is "+(a%b));
            break;
        default:
            System.out.println("wrong choice");
    }

    }
}
