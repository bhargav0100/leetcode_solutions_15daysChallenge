class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9' || s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                res+=s.charAt(i);
            }
        }
        int l=res.length();
        if(l==1) return true;
        int i=0;
        int j=res.length()-1;
        while(i<j)
        {
            if(res.charAt(i)!=res.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
}