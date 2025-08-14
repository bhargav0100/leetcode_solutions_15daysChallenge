class Solution {
    public String makeGood(String s) {
        Stack<Character>stack=new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty())
            {
                char c=stack.peek();
                if(s.charAt(i)==c+32 || s.charAt(i)==c-32)
                {
                    stack.pop();
                }
                else
                {
                    stack.push(s.charAt(i));
                }
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        String res="";
        for(Character c:stack)
        {
            res+=c;
        }
        return res;
    }
}