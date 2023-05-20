

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressList {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> decompressedList = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                decompressedList.add(val);
            }
        }

        int[] result = new int[decompressedList.size()];
        for (int i = 0; i < decompressedList.size(); i++) {
            result[i] = decompressedList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = decompressRLElist(nums);
        System.out.println(Arrays.toString(result));
    }
}