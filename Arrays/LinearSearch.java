public class LinearSearch {
    public static int linearSearch(int[]nums , int target){
        for (int i = 0; i < nums.length ; i++) {
            if(target == nums[i]){
             return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int nums[] = {99,88,79,92,93};
       int target =92;
       int ans=linearSearch(nums,target);
        System.out.println("Element found at index :"+ans);
    }
}


// Element found at index :3