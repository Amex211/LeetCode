
class MaximumWordinSentence{
public static void main(String[] args) {
    String[] sentences = {"Das ist ein Satz.", "Hallo Welt", "Ich bin Amex"};
    int maxWords = findMaxWords(sentences);
    System.out.println("Maximum number of words in a single sentence: " + maxWords);
}

public static int findMaxWords(String[] sentences) {
    int maxWords = 0;

    for (String sentence : sentences) {
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        if (wordCount > maxWords) {
            maxWords = wordCount;
        }
    }

    return maxWords;
}
}