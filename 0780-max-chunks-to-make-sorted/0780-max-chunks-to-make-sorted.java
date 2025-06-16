class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunk = 0 , sum = 0;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             int val = (i*(i+1))/2;
             if(val==sum){
                chunk++;
             }
        }
        return chunk;
    }
}