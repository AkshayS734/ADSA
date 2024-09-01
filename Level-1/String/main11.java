//WAP to accept a word and convert it to piglatin form(trouble --- oubletray)

import java.util.Scanner;
public class main11{
        public static String convertToPigLatin(String word) {
            String vowels = "aeiou";
            if (vowels.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
                return word + "way";
            } else {
                int index = word.length();
                for (int i = 0; i < word.length(); i++) {
                    if (vowels.indexOf(Character.toLowerCase(word.charAt(i))) != -1) {
                        index = i;
                        break;
                    }
                }
                String cons = word.substring(0, index);
                String rest = word.substring(index);
                return rest + cons + "ay";
            }
        }
    
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String str = in.nextLine();
            String res = convertToPigLatin(str);
            System.out.println("The Pig Latin form of '" + str + "' is '" + res + "'");
            in.close();
    }
}