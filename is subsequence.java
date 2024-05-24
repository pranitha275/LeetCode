import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty())
        return true;

        int i=0;
        for( char c : t.toCharArray())
        {
            if (s.charAt(i) == c && ++i == s.length())
            {
                return true;
            }
        }
        return false;
    }
}