public class Pattern11 {

    public static void triangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(4);
    }
}


// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1