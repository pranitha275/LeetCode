class Solution {
    public int maxArea(int[] height) {
        
          int l = 0;
          int len=height.length;
        int r = len -1;
        int area = 0;
     
        while (l < r)
        {
            
            area = Math.max(area, 
                        Math.min(height[l], height[r]) * (r - l));
                         
            if (height[l] < height[r])
                l += 1;
                 
            else
                r -= 1;
        }
        return area;
    
     
    
        
    }
}