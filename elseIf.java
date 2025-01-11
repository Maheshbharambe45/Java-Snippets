import java.util.*;

public class elseIf {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int age = sc.nextInt();
    if(age >=2 && age<=5){
        System.out.println("baby");
    }
    else if(age>=3 && age<=18){
        System.out.println("Teenager");
    }
    else if(age>=18 && age<=60){
        System.out.println("Adult");
    }
    else if(age>=60 && age<=164){
        System.out.println("Senior citision");
    }
    else{
        System.out.println("According to my database highest age of human is 164 years , i think you enter wrong choise");
    }
    }
}





