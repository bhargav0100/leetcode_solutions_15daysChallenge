class Solution {
    public String removeDuplicates(String s, int k) {
        if(s.length()<k) return s;
        Stack<int []> st=new Stack();
        for(int i=0;i<s.length();i++)
        {
           if(!st.isEmpty() && st.peek()[0]==s.charAt(i))
           {
            st.peek()[1]++;
           }
           else
           {
            st.push(new int[]{s.charAt(i),1});
           }
           if(st.peek()[1]==k)
           {
            st.pop();
           }
        }
        String res="";
        for(int [] c:st)
        { 
            char ch=(char)c[0];
            int i=0;
            while(i<c[1])
            {
                res+=ch;
                i++;
            }
        }
        return res;
    }
}