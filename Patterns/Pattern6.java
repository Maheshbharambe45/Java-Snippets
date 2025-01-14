public class Pattern6 {
    public static void main(String[] args) {
        int n=4;
        char ch = 'A';
        for (int i = 1; i <=n ; i++) {  //outer loop
            for (int j = 1; j <=i ; j++) { // it prints 4 times until condition false
                System.out.print(ch); // print value of j
                ch++;
            }
            System.out.println();
        }
    }
}

// A
// BC
// DEF
// GHIJ