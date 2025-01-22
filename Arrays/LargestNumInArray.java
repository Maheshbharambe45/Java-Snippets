import java.util.*;

public class LargestNumInArray {
    public static int largestInArray(int[]nums){
        int largest = Integer.MIN_VALUE; //- infinity value
        for (int i = 0; i < nums.length ; i++) {
            if(largest < nums[i]){ //if largest is less than num in array
                largest = nums[i];  //then largest = num
            }
        }
        return largest;
    }

    public static void main(String[] args) {
       int nums[] = {99,88,79,92,93};
       int ans=largestInArray(nums);
        System.out.println("Largest element is :"+ans);
    }
}

// Largest element is :99