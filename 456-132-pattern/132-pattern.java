class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer>s=new Stack();
		int large=Integer.MIN_VALUE;
		for(int i=nums.length-1;i>=0;i--)
		{
            if(nums[i]<large)
            {
                return true;
            }
            while(!s.isEmpty() && s.peek()<nums[i])
            {
                large=s.pop();
            }
            s.push(nums[i]);
		}
		return false;
    }
}