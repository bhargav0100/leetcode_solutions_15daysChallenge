class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer>l=new ArrayList();
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]>0)
            {
                l.add(asteroids[i]);
            }
            else
            {
                while(!l.isEmpty() && l.get(l.size()-1)>0 && l.get(l.size()-1)<Math.abs(asteroids[i]) )
                {
                    l.remove(l.size()-1);
                }
                if(!l.isEmpty() && l.get(l.size()-1)==Math.abs(asteroids[i]) )
                {
                    l.remove(l.size()-1);
                }
                else if(l.isEmpty() || l.get(l.size()-1)<0)
                {
                    l.add(asteroids[i]);
                }
            }
        }
        int[] arr=l.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}