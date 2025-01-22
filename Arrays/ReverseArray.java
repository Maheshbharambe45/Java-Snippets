public class ReverseArray {
    public static void reverse(int []nums){
        int start = 0 , end = nums.length-1;
        
        while(start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {10,32,22,40,45};
        reverse(nums);
        
        for(int i=0 ; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

// 45 40 22 32 10 