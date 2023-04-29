package Easy;

public class CheckForPalindrome {
    public static void main(String[] args) {
        int x = 121;
        CheckForPalindrome palin = new CheckForPalindrome();
        System.out.println(palin.checkPalin(x));
    }
    public  boolean checkPalin(int x){
        String converted = Integer.toString(x);
        String rev = new StringBuilder(converted).reverse().toString();
        if(converted.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}
