import java.util.*;
public class InbuiltSort {
    public static void traverse(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
    int [] arr = {22,1,3,4,2,55,32,89};
        Arrays.sort(arr);
        traverse(arr);
    }
}

// 1 2 3 4 22 32 55 89 