class Solution {
    public int countPoints(String rings) {
        HashMap<Integer , HashSet<Character>> hm = new HashMap<>();
        for(int i = 0;i < rings.length();i+=2)
        {
            char c = rings.charAt(i);
            int n = rings.charAt(i + 1) - '0';
            hm.putIfAbsent(n , new HashSet<>());
            hm.get(n).add(c); 
        }
        int count = 0;
        for(HashSet<Character> c : hm.values())
        {
            if(c.size()==3) count++;
        }
        return count;
    }
}