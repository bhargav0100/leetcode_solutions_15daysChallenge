class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[]res=new int[nums.length-k+1];
        int j=0;
        Deque<Integer>d=new ArrayDeque();
        for(int i=0;i<nums.length;i++)
        {
            if(!d.isEmpty() && d.peek()==i-k)
            {
                d.poll();
            }
            while(!d.isEmpty() && nums[d.peekLast()]<nums[i])
            {
                d.pollLast();
            }
            d.add(i);
            if(i>=k-1)
            {
                res[j++]=nums[d.peek()];
            }
        }
        return res;
    }
}