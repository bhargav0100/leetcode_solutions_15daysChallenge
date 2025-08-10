class Solution {
    public String simplifyPath(String path) {
        Stack<String>s=new Stack();
        String res="";
        String [] str=path.split("/");
        for(String ele:str)
        {
            if(ele.equals(".."))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else if(!ele.equals(".") && !ele.equals(""))
            {
                s.push(ele);
            }
        }
        if(s.isEmpty())
        {
            return "/";
        }
        for(String ele:s)
        {
            res+="/"+ele;
        }
        return res;
    }
}