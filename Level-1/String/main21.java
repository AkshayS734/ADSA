//WAP to accept a sentence and extract the palindrome words


import java.util.Scanner;
public class main21{
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String sentence = in.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println("Palindrome words:");
        for (String word : words) {
            word = word.toLowerCase();
            if (isPalindrome(word) && !word.isEmpty()) {
                System.out.println(word);
            }
        }
        in.close();
    }
}