public class GetSum{
    public static int getSum(int n){
        int sum = 0;
        while(n>0){
            int lastNum = n % 10;
            sum = sum + lastNum;
            n = n/ 10;
        }
        return sum;
    }
    public static void main(String [] args)
    {
        System.out.println(getSum(234));
    }
}