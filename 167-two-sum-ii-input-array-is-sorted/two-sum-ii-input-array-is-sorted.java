class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] arr=new int [2];
        Map<Integer,Integer>m=new HashMap();
        for(int i=0;i<numbers.length;i++)
        {
            int num=target-numbers[i];
            if(m.containsKey(num))
            {
                int index=m.get(num);
                arr[0]=index;
                arr[1]=i+1;
                return arr;
            }
            else
            {
                m.put(numbers[i],i+1);
            }
        }        
        return arr;
    }
}