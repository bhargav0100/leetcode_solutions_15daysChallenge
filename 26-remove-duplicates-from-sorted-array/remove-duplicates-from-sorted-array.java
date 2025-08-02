class Solution {
    public int removeDuplicates(int[] nums) {
        
        // int [] arr=new int[nums.length];
        int j=0;
        int unique=-1;
        // arr[j++]=nums[0];
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
        // for(int i=0;i<j;i++)
        // {
        //     nums[i]=arr[i];
        // }
        
        return j;
    }
}