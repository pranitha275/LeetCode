class Solution {
    public boolean closeStrings(String word1, String word2) {

        /*if(word1.length()!=word2.length())
        return false;
        else
        {
            Map<Character, Integer> s1 = new HashMap<Character, Integer>();
            Map<Character, Integer> s2 = new HashMap<Character, Integer>();
            
            for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            char c1=word2.charAt(i);
            Integer val = s1.get(c);
            Integer val2=s2.get(c1);
             if (val2 != null) {
                s2.put(c1, val2 + 1);
             }
            else {
                s2.put(c1, 1);
            }
            if (val != null) {
                s1.put(c, val + 1);
             }
            else {
                s1.put(c, 1);
            }
            }
            System.out.println(s1.size()+"..."+s2.size());
            System.out.println(s1.values()+"..."+s2.values());
            System.out.println(s1+".."+s2);
            System.out.println(s1.keySet()+".."+s2.keySet());
            if(s1.size()==s2.size())
            {
            if(s1.keySet()==s2.keySet() && s1.values()==s2.values())
            {
            
            return true;
            }
            else
            {
                return false;
            }
            }
            else
            return false;

            
        }
       
       // return true;*/
       int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < word1.length(); ++i) {
            ++cnt1[word1.charAt(i) - 'a'];
        }
        for (int i = 0; i < word2.length(); ++i) {
            ++cnt2[word2.charAt(i) - 'a'];
        }
        for (int i = 0; i < 26; ++i) {
            if ((cnt1[i] == 0) != (cnt2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(cnt1);
        Arrays.sort(cnt2);
       
        return Arrays.equals(cnt1, cnt2);
    
    }
}