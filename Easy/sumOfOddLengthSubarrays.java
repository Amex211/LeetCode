public class sumOfOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int sum = sumOfOddLengthSubarrays2(arr);
        System.out.println("Sum of all possible odd-length subarrays: " + sum);
    }

    public static int sumOfOddLengthSubarrays2(int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int len = 1; len <= n - i; len += 2) {
                int subarraySum = 0;
                for (int j = i; j < i + len; j++) {
                    subarraySum += arr[j];
                }
                sum += subarraySum;
            }
        }

        return sum;
    }
}