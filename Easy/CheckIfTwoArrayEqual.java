public class CheckIfTwoArrayEqual {
    public static void main(String[] args) {
        String[] word1 = {"abc", "def"};
        String[] word2 = {"abcdef"};

        boolean result = arrayStringsAreEqual(word1, word2);
        System.out.println("Are the arrays representing the same string? " + result);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);

        return str1.equals(str2);
    }
}