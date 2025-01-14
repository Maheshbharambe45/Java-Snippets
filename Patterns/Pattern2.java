public class Pattern2 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n ; i++) {  //outer loop
            for (int j = 1; j <=(n-i+1) ; j++) {  //4-1+1= 4 , next time 3-1+1 =3 like that
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ****
// ***
// **
// *