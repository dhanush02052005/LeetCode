class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums2){
            while(!stack.empty() && num > stack.peek()){
                map.put(stack.peek(),num);
                stack.pop();
            }
            stack.push(num);
        }
        while(!stack.empty()){
            map.put(stack.peek(),-1);
            stack.pop();
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}