class Solution {
    public void moveZeroes(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[x]=nums[i];
                x++;
            }
        }

        for(int j=x;j<nums.length;j++){
            nums[j]=0;
        }

    }
}