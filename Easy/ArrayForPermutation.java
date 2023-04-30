package Easy;
public class ArrayForPermutation {
    public static void main(String[] args) {
        System.out.println("This is a question for array permutation \n");
        int [] arr ={0,2,1,5,3,4};
        System.out.println("Old Array: \n");
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        ArrayForPermutation arrInput = new ArrayForPermutation();
        int [] res = arrInput.buildArray(arr);
        System.out.println("New parmutation Array: \n");
        for(int i = 0; i< arr.length; i++){
            System.out.println(res[i]);
        }
    }
    public int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            ans[i]= nums[nums[i]];
        }
        return ans;
    }
}
