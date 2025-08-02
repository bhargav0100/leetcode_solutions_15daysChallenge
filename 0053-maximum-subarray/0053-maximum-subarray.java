class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums[0];
        int l=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            n+=nums[i];
            if(n<nums[i])
            {
                n=nums[i];
            }
            if(n>l)
            {
                l=n;
            }
        }
        return l;

    }
}