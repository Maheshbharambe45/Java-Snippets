class ContainerWithMaxWater {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int MaxArea = 0;

        while(left < right){
            int area = Math.min(height[left] , height[right]) * (right - left);

            MaxArea = Math.max(area,MaxArea);

            if(height[left] < height[right]){
                left ++;
            }
            else{
                right--;
            }
        }
        return MaxArea;
    }
}


//problem 11 leetcode 