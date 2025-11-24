class Solution {
    public String frequencySort(String s) {
        //int[] arr = new int[128];
        //HashSet<Integer> hs = new HashSet<>();
        
        Map<Character,Integer> map = new HashMap<>();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            //arr[s.charAt(i) - 'a']++;
        }
        // for(Integer i : map.values()){
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        //     hs.add(i);
        // }
        list.sort((a,b) -> b.getValue() - a.getValue());
        for (Map.Entry<Character, Integer> entry : list){
            System.out.println(entry.getKey() + entry.getValue());
            for(int j=0;j<entry.getValue();j++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}