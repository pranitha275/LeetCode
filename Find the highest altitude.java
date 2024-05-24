class Solution {
    public int largestAltitude(int[] gain) {

        int mx=0, p=0;
        for(int i=0;i<gain.length;i++)
        {
            p=p+gain[i];
            mx=Math.max(mx,p);
        }
        return mx;
        
    }
}