 
import java.util.*; 
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr=new ArrayList<>();
        int mx=0;
        for(int i=0;i<candies.length;i++)
        {
            if(mx<candies[i])
            mx=candies[i];
            else
            mx=mx;
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=mx)
            arr.add(true);
            else
            arr.add(false);
        }
        return arr;
    }
}