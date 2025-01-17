class Solution {
    public int scoreOfParentheses(String st) {
        Stack<Integer> s = new Stack();
        int score = 0;
        for(char c : st.toCharArray())
        {
            if(c=='(') 
            {
                s.push(score);
                score = 0;
            }
            else
            score = s.pop() + Math.max(2*score , 1);
        }
        return score;
    }
}