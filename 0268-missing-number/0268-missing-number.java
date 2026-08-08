class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int arrsum=0;
        for(int i=0 ; i<=nums.length;i++){
            sum=sum+i;
        }
        for(int j=0; j<nums.length;j++){
           arrsum=arrsum+nums[j];
        }
        return  sum-arrsum;
      
    }
}