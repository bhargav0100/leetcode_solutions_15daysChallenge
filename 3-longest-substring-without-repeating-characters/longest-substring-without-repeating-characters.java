class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>m=new HashMap();
        int length=0;
        int maxlength=0;
        int left=0;
        int right=0;
        while(right<s.length())
        {
            if(m.containsKey(s.charAt(right)))
            {
                int i=m.get(s.charAt(right));
                if(i>=left)
                {
                    m.put(s.charAt(right),right);
                    maxlength=Math.max(length,maxlength);
                    left=i+1;
                    length=right-left+1;
                }
                else
                {
                    m.put(s.charAt(right),right);
                    length++;
                }
                right++;
            }
            else
            {
                m.put(s.charAt(right),right);
                length++;
                right++;
            }
        }
        return Math.max(length,maxlength);
    }
}