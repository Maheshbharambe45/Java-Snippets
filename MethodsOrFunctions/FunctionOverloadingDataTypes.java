public class FunctionOverloadingDataTypes {
    public static int add(int a , int b){ // for adding int data type
        return a+b;
    }
    public static float add(float a , float b){ // for adding float data type
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(3,5));  //int val
        System.out.println(add(3.5f,4.5f)); //float val
    }
}
