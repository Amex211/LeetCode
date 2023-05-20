

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        int res [] = twoSum(arr,target);
        System.out.println("This is my Solution:\n");
        System.out.println(res[0] + " and " +res[1]);
    }
    public static int [] twoSum(int arr[], int target){
        int sum = 0;
        for(int i = 0; i < arr.length;i++ ){
            for(int j = i+1; j<arr.length; j++){
                
                sum = arr[i]+arr[j];
                if(sum == target)
                {
                    return new int [] {i,j};
                }
            }
        }
        return new int [] {-1,1}; 
    }
}
