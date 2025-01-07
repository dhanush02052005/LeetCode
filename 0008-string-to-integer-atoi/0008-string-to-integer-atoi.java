import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) {
        
        s = s.strip();
        if(s.isEmpty()) return 0;
        int sign  = 1;
        int i = 0 ;
        long res = 0;
        if(s.charAt(0)=='-') 
        {
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+')
        {
            
            i++;
        }
        while(i < s.length())
        {
            //if(s.charAt(0)=='-'){}
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') res = res * 10 + (s.charAt(i) - '0');
            else break;
            if (sign * res <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            if (sign * res >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
            i++;
        }
        return sign * (int)res;
    }
}