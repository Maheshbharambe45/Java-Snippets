public class FunctionOverloading {
    // add two nums
  public static int add(int a , int b ){ //pass two parameters
      return a+b;
  }
  // add three numbers
    public static int add(int a , int b, int c ){ //pass three parameters
        return a+b+c;
    }
    public static void main(String[] args) {
    System.out.println(add(3,4));
    System.out.println(add(3,3,1));
    }
}