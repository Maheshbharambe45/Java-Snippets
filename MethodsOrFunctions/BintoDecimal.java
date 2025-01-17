public class BintoDecimal {
    public static void BintoDec(int n){
        int mynum = n;
        int pow =0;
        int dec =0;

        while (n>0){
            int lastDiit = n%10; // last digit
            dec = dec + (lastDiit * (int)Math.pow(2, pow));

            pow++; //increase by 1
            n=n/10; // remove last el
        }
        System.out.println("Decimal of "+mynum+" is :"+dec);
    }
    public static void main(String[] args) {
    BintoDec(100);
    }
}