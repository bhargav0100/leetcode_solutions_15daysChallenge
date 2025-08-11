class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap();
        m.put(0,-1);
        int mod=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            mod=sum%k;
            if(m.containsKey(mod))
            {
                int index=m.get(mod);
                if(i-1!=index)
                {
                    return true;
                }
            }
            else
            {
                m.put(mod,i);
            }
        }
        return false;
    }
}