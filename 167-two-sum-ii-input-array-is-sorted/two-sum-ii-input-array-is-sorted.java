class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>m=new HashMap();
        for(int i=0;i<numbers.length;i++)
        {
            int num=target-numbers[i];
            if(m.containsKey(num))
            {
                int index=m.get(num);
                return new int[] {index,i+1};
            }
            else
            {
                m.put(numbers[i],i+1);
            }
        }        
        return new int[] {-1,-1};
    }
}