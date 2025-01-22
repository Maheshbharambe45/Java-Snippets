public class PairsInArray {
    public static void pairs(int []nums){
        int temp=0;
        for(int i =0 ; i<nums.length;i++){
            int curr = nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+curr+","+nums[j]+")");
                    temp++;
            }
             System.out.println();
        }
         System.out.println("Total pairs "+temp);
    }
    public static void main(String[] args) {
        int [] nums = {2,4,6,8,10};
        pairs(nums);
    }
}

// (2,4)(2,6)(2,8)(2,10)
// (4,6)(4,8)(4,10)
// (6,8)(6,10)
// (8,10)

// Total pairs 10