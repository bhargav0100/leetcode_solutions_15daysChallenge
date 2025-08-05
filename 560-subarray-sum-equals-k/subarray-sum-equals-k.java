class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap();
        int sum=0;
        int count=0;
        m.put(0,1);
        for(int n:nums)
        {
            sum+=n;
            if(m.containsKey(sum-k))
            {
                count+=m.get(sum-k);
            }
            if(m.containsKey(sum))
            {
                int i=m.get(sum);
                m.put(sum,++i);
            }
            else
            {
                m.put(sum,1);
            }
        }
        return count;
    }
}