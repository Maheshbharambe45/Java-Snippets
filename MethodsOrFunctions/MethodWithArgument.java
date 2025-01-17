import java.util.*;

public class MethodWithArgument {
    public static void getsum(int a , int b){ // parameters or formal parameters
        System.out.println("Sum is :"+(a+b));
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first num");
    int a = sc.nextInt();

    System.out.println("Enter second num");
    int b = sc.nextInt();

    getsum(a,b); //Called and ( pass arguments or actual parameters )
    }
}