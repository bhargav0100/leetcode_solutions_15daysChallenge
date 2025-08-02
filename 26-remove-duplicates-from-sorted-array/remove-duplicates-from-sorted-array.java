class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j=0;
        int unique=-1;
        for(int i=0;i<nums.length;i++)
        {
            
            if(unique!=nums[i])
            {
                nums[j++]=nums[i];
                unique=nums[i];
            }
            if(i==0 && nums[i]==-1)
            {
                nums[j++]=nums[i];
            }
        }
        
        return j;
    }
}
