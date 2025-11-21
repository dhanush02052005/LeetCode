class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        s = s.strip();
        //return s;
        int i = 0,k=0;
        while(i < s.length()){
            if(s.charAt(i)==' '){
                if(k==0) k++;
                else  sb1.append(' ');
                if(sb1.charAt(0)!=' ') res.insert(0,sb1);
                sb1.setLength(0);
            }
            else sb1.append(s.charAt(i));
            i++;
        } 
        if(k!=0) sb1.append(' ');
        res.insert(0,sb1);
        return res.toString();
    }
}