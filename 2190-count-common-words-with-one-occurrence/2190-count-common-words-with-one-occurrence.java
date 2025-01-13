class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String , Integer> hm1 = new HashMap<String , Integer>();
        HashMap<String , Integer> hm2 = new HashMap<String , Integer>();
        for(int i = 0;i < words1.length;i++)
        {
            hm1.put(words1[i] , hm1.getOrDefault(words1[i] , 0) + 1);
        }
        for(int i = 0;i < words2.length;i++)
        {
            hm2.put(words2[i] , hm2.getOrDefault(words2[i] , 0) + 1);
        }
        int c = 0;
        for(String st : hm1.keySet())
        {
            if(hm1.get(st)==1 &&  hm2.getOrDefault(st , 0) == 1) c++;
        }
        return c;
    }
}