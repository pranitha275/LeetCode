class Solution {
    private boolean isvowel(char c)
    {return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';}

    public int maxVowels(String s, int k) {
         int t = 0, n = s.length();
        for (int i = 0; i < k; ++i) {
            if (isvowel(s.charAt(i))) {
                ++t;
            }
        }
        int ans = t;
        for (int i = k; i < n; ++i) {
            if (isvowel(s.charAt(i))) {
                ++t;
            }
            if (isvowel(s.charAt(i - k))) {
                --t;
            }
            ans = Math.max(ans, t);
        }
        return ans;
    }
}