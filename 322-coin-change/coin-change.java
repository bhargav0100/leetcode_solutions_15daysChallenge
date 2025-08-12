class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1) return 0;
        int[]arr=new int[amount+1];
        for(int i=1;i<=amount;i++)
        {
            arr[i]=Integer.MAX_VALUE;
            for(int c:coins)
            {
                if(c<=i && arr[i-c]!=Integer.MAX_VALUE)
                {
                    arr[i]=Math.min(arr[i],1+arr[i-c]);
                }
            }
        }
        if(arr[amount]==Integer.MAX_VALUE)
        {
            return -1;
        }
        return arr[amount];
    }
}