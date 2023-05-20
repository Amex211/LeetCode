
public class CheckForPalindrome {
    public static void main(String[] args) {
        int x = 121;
        CheckForPalindrome palin = new CheckForPalindrome();
        boolean result = palin.checkPalin(x);
        if(result)
        {
            System.out.println(x + " is a Palindrome");
        }else{
            System.out.println(x + " is not a Palindrome");
        }
    }
    public boolean checkPalin(int x){
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
