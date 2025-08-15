class Solution {
    public int minBitFlips(int start, int goal) {
        int res=start^goal;
        int count=0;
        while(res>0)
        {
            int rem=res%2;
            if(rem==1)
            {
                count++;
            }
            res/=2;
        }
        return count;
    }
}