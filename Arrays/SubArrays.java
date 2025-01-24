public class SubArrays {
    public static void subarr(int [] nums){
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                }
                 System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    int [] nums = {2,4,6,8,10};
        subarr(nums);
    }
}


// 2 
// 2 4 
// 2 4 6 
// 2 4 6 8 
// 2 4 6 8 10 

// 4 
// 4 6 
// 4 6 8 
// 4 6 8 10 

// 6 
// 6 8 
// 6 8 10 

// 8 
// 8 10 

// 10 