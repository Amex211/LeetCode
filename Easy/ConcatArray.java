package Easy;
public class ConcatArray {
    public static void main(String[] args) {
        ConcatArray conc = new ConcatArray();
        int [] nums = {1,2,1};
        int [] numsres = conc.getConcatenation(nums);
        for(int i = 0; i<numsres.length;i++){
            System.out.println(numsres[i]);
        }
        
    }
    public int[] getConcatenation(int[] nums) {
        int [] arr = new int [nums.length*2];
        int j = 0;
        for(int i = 0; i< nums.length*2;i++){
            if(i<nums.length){
                arr[i] = nums[i];    
            }        
            if(i>=nums.length){
                arr[i] = nums[j]; 
                j++;   
            }
            
        }
        return arr;
    }
    
}
