public class BinarySearch {
    public static int BinarySearch(int []nums , int target){
        int start =0;
        int end = nums.length-1;

        while (start<=end)
        {
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target) {
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int []nums = {10,20,30,40,50,60,70};
      int target=50;
      int ans = BinarySearch(nums,target);
      System.out.println(ans);
    }
}

// 4