class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String rev[]=s.split(" ");
        String ans="";
        for(int i=rev.length-1;i>=0;i--)
        {
            ans=ans+" "+rev[i];
        }
        
        
        ans=ans.replaceAll("( )+", " ").trim();
        
        return ans;
    }
}