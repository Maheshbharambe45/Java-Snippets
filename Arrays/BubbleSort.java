// "static void main" must be defined in a public class.
public class BubbleSort {
    public static void bubbleSort(int [] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    
    public static void display(int [] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] nums = {5,1,23,12,6,8,100};
        bubbleSort(nums);
        display(nums);
    }
}


// 1 5 6 8 12 23 100 