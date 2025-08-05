class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        boolean value=true;
        while(value)
        {
            int original_length=s.length();
            s=s.replace("()","");
            s=s.replace("{}","");
            s=s.replace("[]","");
            int new_length=s.length();
            if(original_length==new_length) return false;
            if(new_length==0) value=false;
        }
        return true;
    }
}