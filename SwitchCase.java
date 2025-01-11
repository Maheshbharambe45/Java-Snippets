public class SwitchCase {
    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);

        //syntax
//        switch(variable){
//            case1:
//            //code
//            break;
//            case2:
//            //code
//            break;
//
//            case2:
//            //code
//            break;
//
//            default
//            //code
//
//        }

        int num = 2;
        switch (num){
            case 1:
                System.out.println(" case matched with 1");
                break;
            case 2:
                System.out.println("case matched with 2");
                break;
            case 3:
                System.out.println("case matched with 3");
                break;
            default:
                System.out.println("you are leaving in dream wake up");
        }
    }
}