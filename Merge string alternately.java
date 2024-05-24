class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        StringBuilder m=new StringBuilder();
        for (int i=0;i<l1||i<l2;i++)
        {
            if(i<l1)
            m.append(word1.charAt(i));
            if(i<l2)
            m.append(word2.charAt(i));
        }
        return m.toString();
    }
}