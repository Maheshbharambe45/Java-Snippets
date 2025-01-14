public class Pattern4 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n ; i++) {  //outer loop
            for (int j = 1; j <=i ; j++) { // it prints 4 times until condition false
                System.out.print(j); // print value of j
            }
            System.out.println();
        }
    }
}

// 1
// 12
// 123
// 1234