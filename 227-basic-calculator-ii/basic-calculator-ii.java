class Solution {
    public int calculate(String s) {
        Stack<Integer>stack=new Stack();
        int number=0;
        char opr='+';
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                number=(number*10)+(s.charAt(i)-'0');
            }
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ' || i==s.length()-1)
            {
                if(opr=='+')
                {
                    stack.push(number);
                }
                else if(opr=='-')
                {
                    stack.push(-1*number);
                }
                else if(opr=='*')
                {
                    stack.push(stack.pop()*number);
                }
                else if(opr=='/')
                {
                    stack.push(stack.pop()/number);
                }
                number=0;
                opr=s.charAt(i);
            }
        }
        number=0;
        for(Integer i:stack)
        {
            number+=i;
        }
        return number;
    }
}