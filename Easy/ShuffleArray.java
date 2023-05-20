

public class ShuffleArray {
    public static void main(String[] args) {
        int n = 2;
        int [] arr = {1,1,2,2};
        ShuffleArray shuffle = new ShuffleArray();
        int [] res = shuffle.shuffle(arr, n);
        for(int i = 0; i<res.length; i++){
            System.out.println(res[i]);
        }

    }
    public int [] shuffle(int [] nums, int n){
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
    
}
