

public class RunningSumof1darr {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] runningSum = calculateRunningSum(nums);
        for (int num : runningSum) {
            System.out.print(num + " ");
        }
    }

    public static int[] calculateRunningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;
    }
}

