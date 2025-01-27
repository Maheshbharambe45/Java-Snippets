public class InsertionSort {
    public static void insertionSort(int[]arr){
    for(int i=1;i<arr.length;i++){
        int curr = arr[i];
        int prev = i-1;
        //finding out the correct position
        while(prev >=0 && arr[prev] > curr){
            arr[prev+1] =arr[prev];
            prev--;
        }
        //insertion
        arr[prev+1] = curr;
    }
}
 public static void traverse(int [] arr){
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
 }
 public static void main(String[] args) {
 int [] arr = {22,1,3,4,2,55,32,89};
     insertionSort(arr);
     traverse(arr);
 }
}

// 1 2 3 4 22 32 55 89 