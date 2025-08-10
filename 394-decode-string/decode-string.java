class Solution {
    public String decodeString(String s) {
        Stack stack=new Stack();
        int number=0;
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                number=number*10+(s.charAt(i)-'0');
            }
            else if(s.charAt(i)=='[')
            {
                stack.push(res);
                stack.push(number);
                res="";
                number=0;
            }
            else if(s.charAt(i)==']')
            {
                int num=((Integer) stack.pop()).intValue();
                String str=(String)stack.pop();
                String r=res;
                for(int j=0;j<num-1;j++)
                {
                    res+=r;
                }
                res=str+res;
            }
            else
            {
                res+=s.charAt(i);
            }
        }
        return res;
    }
}