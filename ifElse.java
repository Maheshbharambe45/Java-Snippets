import java.util.*;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Yey , you are eligible for vote");
        } else {
            System.out.println(" Oops , your age is " + age + " please come after 18 ");
        }
    }
}