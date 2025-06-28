class Solution {
    String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",  "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        rec(digits,result,new StringBuilder(),0);
        return result;
    }
    public void rec(String digits, List<String> result, StringBuilder sb , int i){
        if(i == digits.length()){
            result.add(sb.toString());
            return;
        }
        for(char c : digitToLetters[digits.charAt(i) - '0'].toCharArray()){
            sb.append(c);
            rec(digits,result,sb,i+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}