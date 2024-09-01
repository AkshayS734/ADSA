//WAP to accept a sentence and display the words having length is greater than 5

import java.util.Scanner;
public class main20{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String sentence = in.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println("Words with length greater than 5:");
        for (String word : words) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }
        in.close();
    }
}