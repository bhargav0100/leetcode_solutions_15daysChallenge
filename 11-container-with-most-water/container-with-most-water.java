class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int lmax=0;
        int rmax=0;
        int min=0;
        int i=0;
        int j=0;
        int area=0;
        while(left<=right)
        {
            if(lmax<height[left])
            {
                lmax=height[left];
                i=left;
            }
            if(rmax<height[right])
            {
                rmax=height[right];
                j=right;
            }
            min=Math.min(lmax,rmax);
            area=Math.max(area,((j-i)*min));
            if(lmax<=rmax)
            {
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}