public class ReverseOfNum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 11022004;

        while (num > 0) {
            int lastDigit = num % 10; // to find last digit;
            System.out.print(lastDigit);
            num = num / 10; // to remove last elemet;
        }
        System.out.println();
    }
}