class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0 , r = 0 , max = 0;
        HashSet<Character> hs = new HashSet<>();
        while(r < s.length())
        {
            if(!hs.contains(s.charAt(r)))
            {
                hs.add(s.charAt(r));
                max = Math.max(max , r - l  + 1);
                r++;
            }
            else
            {
                hs.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}