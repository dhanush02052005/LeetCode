class Pair {
    int value;
    int index;

    Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}
class Solution {
    public int[] twoSum(int[] numbers, int targetSum) {
        int length = numbers.length;
        Pair[] pairs = new Pair[length];

        for (int i = 0; i < length; i++) {
            pairs[i] = new Pair(numbers[i], i);
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a.value, b.value));

        int left = 0, right = length - 1;

        while (left < right) {
            int currentSum = pairs[left].value + pairs[right].value;

            if (currentSum == targetSum) {
                return new int[] { pairs[left].index, pairs[right].index };
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {};
    }
}