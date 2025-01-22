class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(hm.containsKey(c))
            {
                hm.put(c , hm.get(c) + 1);
            }
            else hm.put(c,1);
        }
        int occ = -1;
        for(int val : hm.values())
        {
            if(occ==-1) occ = val;
            else if(occ!=val)
            {
                return false;
            }
        }
        return true;
    }
}