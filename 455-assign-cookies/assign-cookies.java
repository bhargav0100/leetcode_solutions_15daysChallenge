class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int glen=g.length;
        int slen=s.length;
        int l=0;
        int r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<slen && r<glen)
        {
            if(g[r]<=s[l])
            {
                r++;
            }
            l++;
        }
        return r;
    }
}