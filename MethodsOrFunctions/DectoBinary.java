public class DectoBinary {
    public static void DectoBin(int n){
        int mynum = n;
        int pow = 0; //initially 0
        int bin= 0;  //initially 0

        while (n>0){
            int rem = n % 2;  //find remender
            bin = bin +(rem * (int)Math.pow(10,pow)); //add bin+rem+power
            pow++; //increases power
            n=n/2; //num divide by 2
        }
        System.out.println("Binary of "+mynum+" is :"+bin);
    }
    public static void main(String[] args) {
        DectoBin(10);
    }
}