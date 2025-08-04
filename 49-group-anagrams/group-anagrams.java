class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList();
        Map<String,List<String>> map=new HashMap();
        for(String s:strs)
        {
            char [] c=s.toCharArray();
            Arrays.sort(c);
            String str=new String(c);
            if(map.containsKey(str))
            {
                map.get(str).add(s);
            }
            else{
                List<String> slist=new ArrayList();
                slist.add(s);
                map.put(str,slist);
            }
        }
        return new ArrayList(map.values());
    }
}