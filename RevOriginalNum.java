public class RevOriginalNum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 11022004;
        int rev = 0;

        while (num > 0) {
            int lastDigit = num % 10; // to find last digit;
            rev = (rev * 10) + lastDigit; // add the place in variable
            num = num / 10; // to remove last elemet;
        }
        System.out.println(rev);
    }
}