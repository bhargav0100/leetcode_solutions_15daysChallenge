class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            int j=i;
            while(j<nums.length)
            {
                sum+=nums[j];
                j++;
                if(sum==k) count++;
            }
        }
        return count;
    }
}