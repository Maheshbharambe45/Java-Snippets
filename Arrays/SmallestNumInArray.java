import java.util.*;

public class SmallestNumInArray {
    public static int SmallNum(int[]nums){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
       int nums[] = {99,88,79,92,93};
       int ans= SmallNum(nums);
        System.out.println("Smallest element is :"+ans);
    }
}


// Smallest element is :79