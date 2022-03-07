package main;

public class Palindrome {
    public String palindromeSentence(String sentence) {
        String[] words = sentence.toLowerCase().split("  ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (isPalindrome(word)) {
                sb.append(word).append(" ");
            }
        }
        return sb.toString();
    }

    public boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
