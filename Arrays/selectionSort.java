public class selectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
              int temp = arr[min];
              arr[min] = arr[i];
              arr[i] = temp;
        }
    }
    
    public static void traverse(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
    int [] arr = {22,1,3,4,2,55,32,89};
        selectionSort(arr);
        traverse(arr);
    }
}

// 1 2 3 4 22 32 55 89