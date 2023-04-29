package Easy;

public class CheckForPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(checkPalin(x));
    }
    public static boolean checkPalin(int x){
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
