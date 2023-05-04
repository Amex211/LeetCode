package Easy;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        NumberOfGoodPairs solution = new NumberOfGoodPairs();
        int count = solution.numIdenticalPairs(nums);
        System.out.println("Number of good pairs: " + count);
    }
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
