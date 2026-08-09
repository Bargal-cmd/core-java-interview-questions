class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        //[1,1,0,1,1,1]
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
               count = count+1 ;
            }else{
                maxcount=Math.max(count,maxcount);
                count=0;
            }
       
        }
        return Math.max(count,maxcount);
    }
}