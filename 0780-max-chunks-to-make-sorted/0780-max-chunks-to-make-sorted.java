class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunk = 0 , max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            if(max==i) chunk++;
        }
        return chunk;
    }
}