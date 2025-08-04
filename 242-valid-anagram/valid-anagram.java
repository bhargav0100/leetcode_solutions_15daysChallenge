class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        char[]ch1=s.toCharArray();
        char[]ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        s=new String(ch1);
        t=new String(ch2);
        if(s.equals(t))
        {
            return true;
        }
        return false;
    }
}