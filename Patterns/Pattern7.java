public class Pattern7 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n ; i++) {  //outer loop
            for (int j = 1; j <=i ; j++) { // it prints 4 times until condition false
                System.out.print("*"); // print value of j
            }
            System.out.println();
        }
        for (int i = 1; i <=3 ; i++) {  //outer loop
            for (int j = 1; j <=(3-i+1); j++) { // it prints 4 times until condition false
                System.out.print("*"); // print value of j
            }
            System.out.println();
        }
    }
}

// *
// **
// ***
// ****
// ***
// **
// *